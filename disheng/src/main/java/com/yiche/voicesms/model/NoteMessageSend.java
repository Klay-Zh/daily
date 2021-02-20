package com.yiche.voicesms.model;

import java.util.Date;

public class NoteMessageSend {
    private Long id;

    private String mobilePhoneNum;

    private Long messageSendMainId;

    private Short orderId;

    private String apiBigId;

    private Short apiFinalyStatus;

    private String apiFinalyDes;

    private Date createTime;

    private Date apiFinalyTime;

    private Date userReceiveTime;

    private Integer appid;

    private Integer companyId;

    private Integer routewayId;

    private Long messageSendContentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobilePhoneNum() {
        return mobilePhoneNum;
    }

    public void setMobilePhoneNum(String mobilePhoneNum) {
        this.mobilePhoneNum = mobilePhoneNum;
    }

    public Long getMessageSendMainId() {
        return messageSendMainId;
    }

    public void setMessageSendMainId(Long messageSendMainId) {
        this.messageSendMainId = messageSendMainId;
    }

    public Short getOrderId() {
        return orderId;
    }

    public void setOrderId(Short orderId) {
        this.orderId = orderId;
    }

    public String getApiBigId() {
        return apiBigId;
    }

    public void setApiBigId(String apiBigId) {
        this.apiBigId = apiBigId;
    }

    public Short getApiFinalyStatus() {
        return apiFinalyStatus;
    }

    public void setApiFinalyStatus(Short apiFinalyStatus) {
        this.apiFinalyStatus = apiFinalyStatus;
    }

    public String getApiFinalyDes() {
        return apiFinalyDes;
    }

    public void setApiFinalyDes(String apiFinalyDes) {
        this.apiFinalyDes = apiFinalyDes;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getApiFinalyTime() {
        return apiFinalyTime;
    }

    public void setApiFinalyTime(Date apiFinalyTime) {
        this.apiFinalyTime = apiFinalyTime;
    }

    public Date getUserReceiveTime() {
        return userReceiveTime;
    }

    public void setUserReceiveTime(Date userReceiveTime) {
        this.userReceiveTime = userReceiveTime;
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getRoutewayId() {
        return routewayId;
    }

    public void setRoutewayId(Integer routewayId) {
        this.routewayId = routewayId;
    }

    public Long getMessageSendContentId() {
        return messageSendContentId;
    }

    public void setMessageSendContentId(Long messageSendContentId) {
        this.messageSendContentId = messageSendContentId;
    }
}