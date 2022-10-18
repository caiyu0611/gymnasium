package com.njzhenghou.service;


import com.njzhenghou.common.Result;
import com.njzhenghou.domain.User;
import com.njzhenghou.dto.UserDto;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    //用户登陆
    Result getLogin(UserDto userDto);

    //注册用户,新增,并考虑用户是否存在
    Result insertUser(User user);


    //修改密码,先校验数据,在判断前后密码是否一致,在对密码进行修改,在最后清楚Session
    Result updateUserPassword(String newPassword);

}
