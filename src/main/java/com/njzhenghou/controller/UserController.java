package com.njzhenghou.controller;

import com.njzhenghou.common.Result;
import com.njzhenghou.domain.User;
import com.njzhenghou.dto.UserDto;
import com.njzhenghou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //登陆
    @PostMapping("/getLogin")
    public Result getLogin(UserDto userDto){
        return userService.getLogin(userDto);
    }

    //注册
    @PostMapping("/insertUser")
    public Result insertUser(User user){
        return userService.insertUser(user);
    }

    //修改密码
    public Result updateUserPassword(String newPassword){
        return userService.updateUserPassword(newPassword);
    }

}
