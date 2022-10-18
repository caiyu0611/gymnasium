package com.njzhenghou.service;

import com.njzhenghou.common.Result;

import com.njzhenghou.dto.KitInfoSearchDto;

public interface KitInfoService {

//
//    List<KidInfoDto> selectKidInfoAll();
//
//    //动态查询器材
//    List<KidInfoDto> selectKidInfoSearch(KidInfoSearchDto kidInfoSearchDto);
    //查询所有器材,并分页
    Result selectKitInfoAll(int pageNum,int pageSize);

    //动态查询器材,并分页
    Result selectKitInfoSearch(KitInfoSearchDto kidInfoSearchDto);

}
