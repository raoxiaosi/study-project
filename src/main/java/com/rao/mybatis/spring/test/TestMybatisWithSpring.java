package com.rao.mybatis.spring.test;

import com.rao.mybatis.pojo.User;
import com.rao.mybatis.spring.config.SpringConfig;
import com.rao.mybatis.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * mybatis-spring 测试类
 *
 * @author raojing
 * @date 2021/7/1 22:24
 */
public class TestMybatisWithSpring {

    @Test
    public void test001() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        User user1 = userService.selectById(1L);
        User user2 = userService.selectById(1L);
        System.out.println(user1 == user2);
    }

}
