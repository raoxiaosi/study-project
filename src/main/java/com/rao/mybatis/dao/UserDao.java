package com.rao.mybatis.dao;

import com.rao.mybatis.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author raojing
 * @date 2021/6/26 17:29
 */
//@CacheNamespace
public interface UserDao {

    @Select("select id, name, age, address from user where id = #{id} ")
    User getUserById(Long id);

    @Insert("insert into user(id, name, age, address) value (#{id} , #{name} , #{age} ,#{address} )")
    void insert(User user);

    List<User> listAll();

}
