package com.crossyf.seven.web;


import com.crossyf.seven.model.User;
import com.crossyf.seven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Created by YangFan.
 * @date 2019/11/14
 * 功能:
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public Map getUser(String id) {
        Map<String, Object> resultMap = new HashMap<>();
        List<User> userList = userService.selectAllUsers();
//        User user = userService.getUser(id);
//        if (user != null) {
//            return user;
//        }
//        return null;
        resultMap.put("userList",userList);
        resultMap.put("code",200);
        return resultMap;
    }
}
