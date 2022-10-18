package com.njzhenghou.controller;


import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.GifCaptcha;
import com.njzhenghou.common.Constans;
import com.njzhenghou.utils.WebScopeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


//登陆时需要验证码
@Controller
@RequestMapping("/login")
public class CaptchaController {


    //验证码
    @RequestMapping("/getCaptcha")
    public void getCaptcha(HttpServletResponse response){
        //创建验证码
        GifCaptcha gifCaptcha = CaptchaUtil.createGifCaptcha(150, 50, 4);
        String code = gifCaptcha.getCode();
        //将验证码放到session域中
        HttpSession session = WebScopeUtil.getSession();
        session.setAttribute(Constans.CODE_SESSION_KEY,code);
        //将验证码显示出来
        try {
            gifCaptcha.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
