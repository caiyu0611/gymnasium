package com.njzhenghou.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



//模糊查询前台展示的器材信息
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KitInfoSearchDto extends BaseDto {
    //    根据器材名称kitname进行模糊查询

    private String kitName;

}
