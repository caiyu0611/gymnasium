package com.njzhenghou.mapper;

import com.njzhenghou.dto.SiteInfoDto;
import com.njzhenghou.dto.SiteInfoSearchDto;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface SiteInfoMapper {

    //查询所有场地信息
    List<SiteInfoDto> selectSiteInfoAll();


    //模糊查询场地信息
    List<SiteInfoDto> SelectSiteInfoSearch(SiteInfoSearchDto siteInfoSearchDto);


}
