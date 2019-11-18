package com.crossyf.seven.web;

import cn.hutool.core.lang.Console;
import com.crossyf.seven.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Created by YangFan.
 * @date 2019/11/18
 * 功能:
 */
@SpringBootTest
@RunWith(value = SpringRunner.class)
public class ConfigTest {



    @Autowired
    private UserMapper userMapper;

    @Test
    public void testConfig() {
//        Console.log(druidProperties.getUrl() + druidProperties.getUsername());
        Console.log(userMapper.selectUser("crossyf").toString());
    }




}
