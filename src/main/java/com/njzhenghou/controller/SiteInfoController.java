package com.njzhenghou.controller;

import com.njzhenghou.common.Result;
import com.njzhenghou.dto.KitInfoSearchDto;
import com.njzhenghou.dto.SiteInfoDto;
import com.njzhenghou.dto.SiteInfoSearchDto;
import com.njzhenghou.service.KitInfoService;
import com.njzhenghou.service.SiteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/siteInfo")
public class SiteInfoController {

    @Autowired
    private SiteInfoService siteInfoService;


    //查询所有场地
    @RequestMapping(value = "/selectSiteInfoAll")
    public Result selectSiteInfoAll(Integer pageNum,@RequestParam(required = false,defaultValue = "3") Integer pageSize){
        return siteInfoService.selectSiteInfoAll(pageNum, pageSize);
    }

    //模糊查询场地
    @PostMapping(value = "/selectSiteInfoSearch")
    public Result selectSiteInfoSearch(@Valid SiteInfoSearchDto siteInfoSearchDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return Result.Data_FORMAT_ERROR;
        }
        return siteInfoService.selectSiteInfoSearch(siteInfoSearchDto);
    }

}
