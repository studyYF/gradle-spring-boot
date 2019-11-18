package com.crossyf.seven.service.impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.crossyf.seven.mapper.UserMapper;
import com.crossyf.seven.model.User;
import com.crossyf.seven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Created by YangFan.
 * @date 2019/11/14
 * 功能:
 */
@Service
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String id) {
        return userMapper.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userMapper.selectList(null);
    }
}
