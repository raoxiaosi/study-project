package com.rao.mybatis.test;

import com.rao.mybatis.dao.UserDao;
import com.rao.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * mybatis 测试类
 *
 * @author raojing
 * @date 2021/7/1 21:49
 */
public class TestMybatis {

    private SqlSession session;

    @Before
    public void init() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sqlSessionFactory.openSession(true);
    }

    @Test
    public void test001() {
        UserDao userDao = session.getMapper(UserDao.class);
        User user = userDao.getUserById(1L);
        System.out.println(user);
    }

}
