package com.njzhenghou.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


//模糊查询前台展示的场地信息
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SiteInfoSearchDto extends BaseDto{
    //根据场地名称 sitename, 场地位置 sitelocation, 场地状态 sitestatus

    private String SiteName;

    private String siteLocation;

    private String siteStatus;

}
