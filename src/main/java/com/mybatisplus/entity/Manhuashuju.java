package com.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 漫画数据
 * @TableName manhuashuju
 */
@TableName(value ="manhuashuju")
@Data
public class Manhuashuju {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 创建时间
     */
    private Date addtime;

    /**
     * 来源
     */
    private String laiyuan;

    /**
     * 标题
     */
    private String biaoti;

    /**
     * 人气
     */
    private Integer renqi;

    /**
     * 点击
     */
    private Integer dianji;

    /**
     * 订阅
     */
    private Integer dingyue;

    /**
     * 吐槽
     */
    private Integer tucao;

    /**
     * 作者
     */
    private String zuozhe;

    /**
     * 状态
     */
    private String zhuangtai;

    /**
     * 类别
     */
    private String leibie;

    /**
     * 类型
     */
    private String leixing;

    /**
     * 封面
     */
    private String fengmian;

    /**
     * 介绍
     */
    private String jieshao;

    /**
     * 最近点击时间
     */
    private Date clicktime;
}