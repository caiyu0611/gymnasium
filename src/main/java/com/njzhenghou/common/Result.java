package com.njzhenghou.common;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//通用的方法类
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    //表示成功 状态码 200
    private Integer code = 200;

    //表示错误的消息内容 值是-1的时候才显示
    private String msg;

    //显示查询成功之后显示的内容信息
    private Object data;

    //查询时候满足条件的记录数
    private Long total = 0l;

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static final Result Data_FORMAT_ERROR = new Result(-1,"传入的参数有误");
}
