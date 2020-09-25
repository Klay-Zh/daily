package com.sinosoft.pojo;

import java.io.Serializable;
import java.util.Date;

public class SysCompany implements Serializable {
    private String id;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 上级公司id
     */
    private String parentId;

    /**
     * 公司等级(目前只有两级,诚和通和其他物流公司)
     */
    private String level;

    /**
     * 排序规则
     */
    private Integer seq;

    /**
     * 公司状态:1-可用 0-不可用
     */
    private String status;

    /**
     * 占位符2
     */
    private String standbyflag2;

    /**
     * 占位符3
     */
    private String standbyflag3;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作员
     */
    private String operator;

    /**
     * 创建时间
     */
    private Date maketime;

    /**
     * 最近一次修改时间
     */
    private Date modifytime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getStandbyflag2() {
        return standbyflag2;
    }

    public void setStandbyflag2(String standbyflag2) {
        this.standbyflag2 = standbyflag2 == null ? null : standbyflag2.trim();
    }

    public String getStandbyflag3() {
        return standbyflag3;
    }

    public void setStandbyflag3(String standbyflag3) {
        this.standbyflag3 = standbyflag3 == null ? null : standbyflag3.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getMaketime() {
        return maketime;
    }

    public void setMaketime(Date maketime) {
        this.maketime = maketime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", parentId=").append(parentId);
        sb.append(", level=").append(level);
        sb.append(", seq=").append(seq);
        sb.append(", status=").append(status);
        sb.append(", standbyflag2=").append(standbyflag2);
        sb.append(", standbyflag3=").append(standbyflag3);
        sb.append(", remark=").append(remark);
        sb.append(", operator=").append(operator);
        sb.append(", maketime=").append(maketime);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}