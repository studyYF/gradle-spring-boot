package com.crossyf.seven.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Created by YangFan.
 * @date 2019/11/14
 * 功能:
 */
@Data
@TableName(value = "t_base_user")
public class User implements Serializable {
    @TableId("id")
    private String id;
    private String username;
    private String password;
}
