package com.njzhenghou.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.Pattern;


//登陆用
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    //用户名
    private String name;

    //密码
    //  \\d --> [0-9]
    @NonNull
    @Pattern(regexp = "\\d{6}")
    private String password;

    //验证码
    //  \\w --> [0-9a-zA-Z]
    @NonNull
    @Pattern(regexp = "\\w{4}")
    private String captCha;

}
