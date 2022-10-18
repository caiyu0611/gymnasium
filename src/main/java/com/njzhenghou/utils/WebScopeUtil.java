package com.njzhenghou.utils;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


//方便我们在之后的方法中直接获取request等,不需要再输入参数
public class WebScopeUtil {

    //获取request
    public static HttpServletRequest getRequest(){
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) requestAttributes;
        return servletRequestAttributes.getRequest();
    }

    //获取session
    public static HttpSession getSession(){
        return getRequest().getSession();
    }

    //获取application
    public static ServletContext getApplication(){
        return (ServletContext) ContextLoader.getCurrentWebApplicationContext();
    }
}
