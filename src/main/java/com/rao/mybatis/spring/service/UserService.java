package com.rao.mybatis.spring.service;

import com.rao.mybatis.dao.UserDao;
import com.rao.mybatis.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author raojing
 * @date 2021/7/1 23:12
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    @Transactional(rollbackFor = Exception.class)
    public User selectById(Long id) {
        return userDao.getUserById(id);
    }

}
