package com.njzhenghou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.njzhenghou.common.Result;
import com.njzhenghou.dto.KitInfoDto;
import com.njzhenghou.dto.KitInfoSearchDto;
import com.njzhenghou.mapper.KitInfoMapper;
import com.njzhenghou.service.KitInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class KitInfoServiceImpl implements KitInfoService {

    @Autowired
    private KitInfoMapper kitInfoMapper;



    @Override
    public Result selectKitInfoAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<KitInfoDto> kitInfoDtos = kitInfoMapper.selectKitInfoAll();

        Result result = new Result();
        PageInfo<KitInfoDto> kitInfoDtoPageInfo = new PageInfo<>(kitInfoDtos);

        result.setTotal(kitInfoDtoPageInfo.getTotal());
        result.setData(kitInfoDtoPageInfo.getList());
        return result;
    }

    @Override
    public Result selectKitInfoSearch(KitInfoSearchDto kitInfoSearchDto) {
        PageHelper.startPage(kitInfoSearchDto.getPageNum(),kitInfoSearchDto.getPageSize());
        List<KitInfoDto> kitInfoDtos = kitInfoMapper.selectKitInfoSearch(kitInfoSearchDto);

        Result result = new Result();
        PageInfo<KitInfoDto> kitInfoDtoPageInfo = new PageInfo<>(kitInfoDtos);

        result.setTotal(kitInfoDtoPageInfo.getTotal());
        result.setData(kitInfoDtoPageInfo.getList());
        return result;

    }
}
