package com.njzhenghou.text;

import com.njzhenghou.domain.KitInfo;
import com.njzhenghou.dto.*;
import com.njzhenghou.mapper.KitInfoMapper;
import com.njzhenghou.mapper.KitRentMapper;
import com.njzhenghou.mapper.SiteInfoMapper;
import com.njzhenghou.mapper.UserMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;



public class Text {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext.xml");


        UserMapper bean = cpx.getBean(UserMapper.class);


//        KitRentMapper bean = cpx.getBean(KitRentMapper.class);
//        List<KitRentDto> kitRentDtos = bean.selectKitRentDtoAll();
//        System.out.println(kitRentDtos);

//        KitInfoMapper bean = cpx.getBean(KitInfoMapper.class);
//        KitInfoDto kitInfoDto = bean.selectKitInfoId(1);
//        System.out.println(kitInfoDto);

//        KitInfoMapper bean = cpx.getBean(KitInfoMapper.class);
//        List<KitInfoDto> kitInfos = bean.selectKitInfoById(1);
//        System.out.println(kitInfos);

//        SiteInfoMapper bean = cpx.getBean(SiteInfoMapper.class);
//        SiteInfoSearchDto siteInfoSearchDto = new SiteInfoSearchDto();
//        siteInfoSearchDto.setSiteName("羽毛球场一号");
//        siteInfoSearchDto.setSiteLocation("一楼");
//        List<SiteInfoDto> siteInfoDtos = bean.SelectSiteInfoSearch(siteInfoSearchDto);
//        System.out.println(siteInfoDtos);

//        KitInfoMapper bean = cpx.getBean(KitInfoMapper.class);
//        List<KitInfoDto> kitInfoDtos = bean.selectKitInfoAll();
//        System.out.println(kitInfoDtos);


    }
}
