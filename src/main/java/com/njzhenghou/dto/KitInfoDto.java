package com.njzhenghou.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


//前台展示的器材信息
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KitInfoDto {
//    id,kitname,kitnumber,hourprice,sortid
//    主键 器材名称 器材数量   租赁时价   器材分类id

    private Integer id;
    private String kitName;
    private String kitNumber;
    private String hourPrice;
    private Integer sortId;
}
