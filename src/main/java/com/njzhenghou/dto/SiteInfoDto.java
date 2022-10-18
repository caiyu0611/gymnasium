package com.njzhenghou.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


//前台展示的场地信息
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SiteInfoDto {
//    id,addtime,sitename,sitelocation,sitestatus,sitedetails
//       创建时间  场地名称  场地位置      场地状态     场地详情
    private Integer id;
    private Date addTime;
    private String siteName;
    private String siteLocation;
    private String siteStatus;
    private String siteDetails;






}
