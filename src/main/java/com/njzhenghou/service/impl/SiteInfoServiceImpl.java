package com.njzhenghou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.njzhenghou.common.Result;
import com.njzhenghou.dto.KitInfoDto;
import com.njzhenghou.dto.SiteInfoDto;
import com.njzhenghou.dto.SiteInfoSearchDto;
import com.njzhenghou.mapper.KitInfoMapper;
import com.njzhenghou.mapper.SiteInfoMapper;
import com.njzhenghou.service.SiteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SiteInfoServiceImpl implements SiteInfoService {

    @Autowired
    private SiteInfoMapper siteInfoMapper;




    @Override
    public Result selectSiteInfoAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<SiteInfoDto> siteInfoDtos = siteInfoMapper.selectSiteInfoAll();

        Result result = new Result();
        PageInfo<SiteInfoDto> siteInfoDtoPageInfo = new PageInfo<>(siteInfoDtos);

        result.setTotal(siteInfoDtoPageInfo.getTotal());
        result.setData(siteInfoDtoPageInfo.getList());
        return result;
    }


    @Override
    public Result selectSiteInfoSearch(SiteInfoSearchDto siteInfoSearchDto) {
        PageHelper.startPage(siteInfoSearchDto.getPageNum(),siteInfoSearchDto.getPageSize());
        List<SiteInfoDto> siteInfoDtos = siteInfoMapper.SelectSiteInfoSearch(siteInfoSearchDto);

        Result result = new Result();
        PageInfo<SiteInfoDto> siteInfoDtoPageInfo = new PageInfo<>(siteInfoDtos);

        result.setTotal(siteInfoDtoPageInfo.getTotal());
        result.setData(siteInfoDtoPageInfo.getList());
        return result;
    }
}
