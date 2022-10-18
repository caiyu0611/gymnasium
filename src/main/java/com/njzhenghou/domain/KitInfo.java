package com.njzhenghou.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class KitInfo {

    //    id,addtime,kitname,kitnumber,hourprice,sortid
    //    主键 创建时间 器材名称 器材数量    租赁时价   器材分类id

    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date addTime;

    private String kitName;
    private String kitNumber;
    private String hourPrice;


}
