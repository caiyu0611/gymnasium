package com.njzhenghou.controller;

import com.njzhenghou.common.Result;
import com.njzhenghou.dto.KitInfoSearchDto;
import com.njzhenghou.service.KitInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/kitInfo")
public class KitInfoController {

    @Autowired
    private KitInfoService kitInfoService;


    //查询所有器材
    @PostMapping(value = "/selectKitInfoAll")
    public Result selectKitInfoAll(Integer pageNum,@RequestParam(required = false,defaultValue = "3") Integer pageSize){
        return kitInfoService.selectKitInfoAll(pageNum, pageSize);
    }

    //模糊查询器材
    @PostMapping(value = "/selectKitInfoSearch")
    public Result selectKitInfoSearch(@Valid KitInfoSearchDto kitInfoSearchDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return Result.Data_FORMAT_ERROR;
        }
        return kitInfoService.selectKitInfoSearch(kitInfoSearchDto);
    }

}
