package com.njzhenghou.mapper;

import com.njzhenghou.domain.KitInfo;
import com.njzhenghou.dto.KitInfoDto;
import com.njzhenghou.dto.KitInfoSearchDto;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface KitInfoMapper {

    //根据分类的id查询器材,如果没有分类的id,就代表查询所有,并分页
    List<KitInfoDto> selectKitInfoById(Integer sortId);


    //查询所有器材
    List<KitInfoDto> selectKitInfoAll();

    //动态查询器材
    List<KitInfoDto> selectKitInfoSearch(KitInfoSearchDto kidInfoSearchDto);

}
