package com.njzhenghou.utils;

import cn.hutool.crypto.SecureUtil;

public class MD5Util {

    public static String init(String txt){
        //如果传入的数据是null,则返回null
        if (txt == null){
            return null;
        }
        //对传入的数据进行加密
        String encrypt = SecureUtil.md5(txt);
        return encrypt;
    }

    public static String findMD5(String txt){
        return init(init(init(txt)+"aaa")+"bbb");
    }

    public static void main(String[] args) {
        System.out.println(findMD5("123456"));
    }

}
