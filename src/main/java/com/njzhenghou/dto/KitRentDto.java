package com.njzhenghou.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KitRentDto {
//    id ,addtime,kitname, rentnumber,hourprice, hour,totalprice ,username,phone, approve ,ispay
//      主键 创建时间  器材名称  数量        租赁时价    租赁小时数   总价    姓名     手机号   是否审核  是否支付
    //主键
    private Integer id;
    //创建时间
    private Date addTime;
    //器材名称
    private String kitName;
    //数量
    private String rentNumber;
    //租赁时价
    private String hourPrice;
    //租赁小时数
    private String hour;
    //总价
    private String totalPrice;
    //是否审核  0 未审核  1 已审核
    private String approve;
    //是否支付  0 未支付  1 已支付
    private String isPay;
    //用户id
    private Integer userId;
    //姓名
    private String name;
    //手机号
    private String phone;
}
