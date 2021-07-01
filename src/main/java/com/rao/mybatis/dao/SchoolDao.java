package com.rao.mybatis.dao;

import com.rao.mybatis.pojo.School;
import org.apache.ibatis.annotations.Insert;

/**
 * @author raojing
 * @date 2021/6/26 18:02
 */
public interface SchoolDao {

    @Insert("insert into school(id, name, address) value (#{id} , #{name}, #{address})")
    void insert(School school);

}
