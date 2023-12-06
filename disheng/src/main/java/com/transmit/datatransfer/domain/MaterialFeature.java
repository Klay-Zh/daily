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
 * 物资特征项主数据表
 * </p>
 *
 * @author zkl
 * @since 2023-12-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("material_feature")
public class MaterialFeature implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private String id;

    /**
     * 所属物资分类
     */
    @TableField("matcatId")
    private String matcatId;

    /**
     * 业务分类
     */
    @TableField("matType")
    private String matType;

    @TableField("medcatCode")
    private String medcatCode;

    /**
     * 特征项类型
     */
    @TableField("characitemType")
    private String characitemType;

    @TableField("sortNo")
    private String sortNo;

    /**
     * 特征项编码
     */
    @TableField("characitemCode")
    private String characitemCode;

    /**
     * 特征项名称
     */
    @TableField("characitemName")
    private String characitemName;

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
