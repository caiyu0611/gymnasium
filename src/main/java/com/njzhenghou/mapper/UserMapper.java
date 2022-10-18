package com.njzhenghou.mapper;

import com.njzhenghou.domain.User;
import com.njzhenghou.dto.UserDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface UserMapper {

    //用户登陆
    User getLogin(UserDto userDto);

    //注册用户,新增,并考虑用户是否存在
    int insertUser(User user);

    //查询用户是否存在
    int selectUserOne(@Param("name") String name);

    //修改密码,先校验数据,在判断前后密码是否一致,在对密码进行修改,在最后清楚Session
    int updateUserPassword(@Param("id") String id, @Param("password") String newPassword);

    //查询要修改的密码
    String selectUserPassword(String id);

}
