package com.transmit.datatransfer.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 物料主数据表
 * </p>
 *
 * @author zkl
 * @since 2023-12-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("material_data")
public class MaterialData implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一ID
     */
    private String id;

    /**
     * 大类名称
     */
    @TableField("maxcatName")
    private String maxcatName;

    /**
     * 物资分类组合编码
     */
    @TableField("combinedCode")
    private String combinedCode;

    /**
     * 中类编码
     */
    @TableField("medcatCode")
    private String medcatCode;

    /**
     * 计量单位
     */
    @TableField("measunitType")
    private String measunitType;

    @TableField("creatorId")
    private String creatorId;

    /**
     * 物料分级
     */
    @TableField("matGrade")
    private String matGrade;

    /**
     * 能效等级
     */
    private String eneeffindex;

    /**
     * 测量单位名称
     */
    private String measunitname;

    /**
     * 物料编码
     */
    @TableField("matCode")
    private String matCode;

    /**
     * 物料标识
     */
    @TableField("matFlag")
    private String matFlag;

    @TableField("propvalName")
    private String propvalName;

    @TableField("typeCode")
    private String typeCode;

    /**
     * 小类编码
     */
    @TableField("mincatCode")
    private String mincatCode;

    @TableField("tableName")
    private String tableName;

    @TableField("metaEntityId")
    private String metaEntityId;

    @TableField("rsId")
    private String rsId;

    /**
     * 中类名称
     */
    @TableField("medcatName")
    private String medcatName;

    @TableField("creatorOrgId")
    private String creatorOrgId;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 大类编码
     */
    @TableField("maxcatCode")
    private String maxcatCode;

    /**
     * 物料长描述
     */
    @TableField("matCodeDetdes")
    private String matCodeDetdes;

    @TableField("orgId")
    private String orgId;

    /**
     * 物料描述
     */
    @TableField("matCodeDes")
    private String matCodeDes;

    /**
     * 小类名称
     */
    @TableField("mincatnName")
    private String mincatnName;

    /**
     * 状态
     */
    private String status;

    /**
     * 业务分类
     */
    @TableField("matType")
    private String matType;

    /**
     * 产业标识（0主业1产业）
     */
    @TableField("industryMark")
    private String industryMark;

    /**
     * 同步状态（0未同步，1已同步）
     */
    @TableField("syncStatus")
    private String syncStatus;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField("updateTime")
    private LocalDateTime updateTime;


}
