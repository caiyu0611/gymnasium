package com.njzhenghou.service;

import com.njzhenghou.common.Result;
import com.njzhenghou.dto.SiteInfoDto;
import com.njzhenghou.dto.SiteInfoSearchDto;

import java.util.List;

public interface SiteInfoService {

    //查询所有器材,并分页
    Result selectSiteInfoAll(int pageNum, int pageSize);


    //动态查询器材,并分页
    Result selectSiteInfoSearch(SiteInfoSearchDto siteInfoSearchDto);
}
