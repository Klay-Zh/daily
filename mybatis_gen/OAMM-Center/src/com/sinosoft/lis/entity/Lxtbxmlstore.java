package com.sinosoft.lis.entity;

import java.io.Serializable;
import java.util.Date;

public class Lxtbxmlstore implements Serializable {
    /**
     * 流水号
     */
    private Long serialno;

    /**
     * 交易类型  1-承保，2-退保，3-保单查询，4-产品查询，5-电子保单下载，6-产品授权定义，7-产品授权，8-接口授权
     */
    private String transtype;

    /**
     * 目前存1
     */
    private String policytype;

    /**
     * 接口类型 1-标准 2-讯保 3-团体 4-出行关爱 5-航联 6-携程高铁 7-携程 8-携程马拉松 9-天猫 10-京东 11-电子保单 12-PolicySearch保单查询接口 13-SearchPolicy保单查询接口 14个性化退单
     */
    private String interfacetype;

    /**
     * 报文类型：r-请求报文，s-反馈报文
     */
    private String xmltype;

    /**
     * 报文路径
     */
    private String xmlpath;

    /**
     * 操作员
     */
    private String operator;

    private Date makedate;

    private String maketime;

    private Date modifydate;

    private String modifytime;

    /**
     * 备用1 存储prtno
     */
    private String standbyflag1;

    /**
     * 备用2
     */
    private String standbyflag2;

    /**
     * 备用3
     */
    private String standbyflag3;

    /**
     * 备用4
     */
    private String standbyflag4;

    /**
     * 备用5
     */
    private String standbyflag5;

    /**
     * 成功或失败标志 0-成功 1-失败
     */
    private String errorflag;

    private static final long serialVersionUID = 1L;

    public Long getSerialno() {
        return serialno;
    }

    public void setSerialno(Long serialno) {
        this.serialno = serialno;
    }

    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype == null ? null : transtype.trim();
    }

    public String getPolicytype() {
        return policytype;
    }

    public void setPolicytype(String policytype) {
        this.policytype = policytype == null ? null : policytype.trim();
    }

    public String getInterfacetype() {
        return interfacetype;
    }

    public void setInterfacetype(String interfacetype) {
        this.interfacetype = interfacetype == null ? null : interfacetype.trim();
    }

    public String getXmltype() {
        return xmltype;
    }

    public void setXmltype(String xmltype) {
        this.xmltype = xmltype == null ? null : xmltype.trim();
    }

    public String getXmlpath() {
        return xmlpath;
    }

    public void setXmlpath(String xmlpath) {
        this.xmlpath = xmlpath == null ? null : xmlpath.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getMakedate() {
        return makedate;
    }

    public void setMakedate(Date makedate) {
        this.makedate = makedate;
    }

    public String getMaketime() {
        return maketime;
    }

    public void setMaketime(String maketime) {
        this.maketime = maketime == null ? null : maketime.trim();
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getModifytime() {
        return modifytime;
    }

    public void setModifytime(String modifytime) {
        this.modifytime = modifytime == null ? null : modifytime.trim();
    }

    public String getStandbyflag1() {
        return standbyflag1;
    }

    public void setStandbyflag1(String standbyflag1) {
        this.standbyflag1 = standbyflag1 == null ? null : standbyflag1.trim();
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

    public String getStandbyflag4() {
        return standbyflag4;
    }

    public void setStandbyflag4(String standbyflag4) {
        this.standbyflag4 = standbyflag4 == null ? null : standbyflag4.trim();
    }

    public String getStandbyflag5() {
        return standbyflag5;
    }

    public void setStandbyflag5(String standbyflag5) {
        this.standbyflag5 = standbyflag5 == null ? null : standbyflag5.trim();
    }

    public String getErrorflag() {
        return errorflag;
    }

    public void setErrorflag(String errorflag) {
        this.errorflag = errorflag == null ? null : errorflag.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialno=").append(serialno);
        sb.append(", transtype=").append(transtype);
        sb.append(", policytype=").append(policytype);
        sb.append(", interfacetype=").append(interfacetype);
        sb.append(", xmltype=").append(xmltype);
        sb.append(", xmlpath=").append(xmlpath);
        sb.append(", operator=").append(operator);
        sb.append(", makedate=").append(makedate);
        sb.append(", maketime=").append(maketime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", standbyflag1=").append(standbyflag1);
        sb.append(", standbyflag2=").append(standbyflag2);
        sb.append(", standbyflag3=").append(standbyflag3);
        sb.append(", standbyflag4=").append(standbyflag4);
        sb.append(", standbyflag5=").append(standbyflag5);
        sb.append(", errorflag=").append(errorflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}