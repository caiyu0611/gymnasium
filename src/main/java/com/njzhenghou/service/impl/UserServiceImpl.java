package com.njzhenghou.service.impl;

import com.njzhenghou.common.Constans;
import com.njzhenghou.common.Result;
import com.njzhenghou.domain.User;
import com.njzhenghou.dto.UserDto;
import com.njzhenghou.mapper.UserMapper;
import com.njzhenghou.service.UserService;
import com.njzhenghou.utils.MD5Util;
import com.njzhenghou.utils.WebScopeUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //用户登陆
    @Override
    public Result getLogin(UserDto userDto) {
        //从session中获取密码
        HttpSession session = WebScopeUtil.getSession();
        String code = session.getAttribute(Constans.CODE_SESSION_KEY) + "";
        //将获取到的code和产生的code进行比较,如果不是,则验证码错误
        if (!(code.equals(userDto.getCaptCha()))){
            return new Result(-1, "验证码错误");
        }
        //密码加密
        String md5 = MD5Util.findMD5(userDto.getPassword());
        //将加密后的密码在给UserDto
        userDto.setPassword(md5);
        //查询有无此账号
        User user = userMapper.getLogin(userDto);
        if (user == null){
            return new Result(-1, "用户名和密码不正确");
        }

        //分别将用户名和用户id放在session 在用的时候我们就知道这个用户1

        //标记用户
        session.setAttribute(Constans.User_session_id,user.getName());
        //标记角色
        //登陆用户的id标记
        session.setAttribute(Constans.USER_session_key,user.getId());

        Result result = new Result();
        result.setData(user);
        return result;
    }

    //注册用户,新增,并考虑用户是否存在
    @Override
    public Result insertUser(User user) {
        //将要添加的密码加密
        String md5 = MD5Util.findMD5(user.getPassword());
        //将要加密后的密码给user
        user.setPassword(md5);
        String name = user.getName();
        System.out.println(name);
        int i = userMapper.selectUserOne(name);
        System.out.println(i);
        if (i == 1){
            return new Result(-1, "用户名已存在,请重新注册");
        }
        //判断添加成不成功
        int i1 = userMapper.insertUser(user);
        if (i1 == 0){
            return new Result(-1, "添加失败");
        }
        return new Result();
    }

    //修改密码,先校验数据,在判断前后密码是否一致,在对密码进行修改,在最后清楚Session
    @Override
    public Result updateUserPassword(String newPassword) {
        //数据校验
        if (newPassword == null || !(newPassword.matches("\\w{6}"))){
            return Result.Data_FORMAT_ERROR;
        }
        //判断新密码与原密码是否一样
        //获取输入的新密码用户的id
        HttpSession session = WebScopeUtil.getSession();
        String userId = session.getAttribute(Constans.User_session_id) + "";
        //通过获取的id找到对应的老密码
        String oldPassword = userMapper.selectUserPassword(userId);
        //将获取到的新密码加密
        String newPsw = MD5Util.findMD5(newPassword);
        //新密码和老密码比较
        if (newPsw.equals(oldPassword)){
            return new Result(-1, "新密码不能和旧密码一样");
        }
        //修改密码失败
        int i = userMapper.updateUserPassword(userId, newPsw);
        if (i == 0){
            return new Result(-1, "修改失败");
        }
        //关闭session
        session.removeAttribute(Constans.CODE_SESSION_KEY);
        return new Result();
    }

}
