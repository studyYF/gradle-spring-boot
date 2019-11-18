package com.crossyf.seven.service;


import com.crossyf.seven.model.User;

import java.util.List;

/**
 * @author Created by YangFan.
 * @date 2019/11/14
 * 功能:
 */


public interface UserService {
    User getUser(String id);

    List<User> selectAllUsers();
}
