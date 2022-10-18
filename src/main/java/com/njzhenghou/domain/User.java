package com.njzhenghou.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * 前台用户登陆后的信息
 * 同时注册也是这个信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
//    id ,addtime ,name ,password ,sex ,phone ,email

    //主键
    private Integer id;
    //注册时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date addtime;
    //姓名
    private String name;
    //密码
    private String password;
    //性别
    private String sex;
    //手机号
    private String phone;
    //邮箱
    private String email;

}
