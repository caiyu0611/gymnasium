package com.njzhenghou.mapper;

import com.njzhenghou.dto.KitInfoDto;
import com.njzhenghou.dto.KitRentDto;

import java.util.List;

public interface KitRentMapper {

    //    id ,addtime,kitname, rentnumber,hourprice, hour,totalprice ,username,phone, approve ,ispay
//      主键 创建时间  器材名称  数量        租赁时价    租赁小时数   总价    姓名     手机号   是否审核  是否支付

    //用户添加器材给自己使需要
    //根据器材的id找到器材
    KitInfoDto selectKitInfoId(Integer id);

    //查自己的租赁器材
    List<KitRentDto> selectKitRentDtoAll();

    //添加自己的租赁器材,就是点击租赁器材
    Integer insertKitRent(KitRentDto kitRentDto);

    //对自己租赁器材的修改,只能修改租赁的小时数和数量,同时审核状态为0的时候才能修改成功
    Integer updateKitRent(Integer id);

    //归还器材,就是删除自己租赁的器材,或者不想要自己租赁的器材(为审核通过为支付)
    Integer deleteKitRent(Integer id);


}
