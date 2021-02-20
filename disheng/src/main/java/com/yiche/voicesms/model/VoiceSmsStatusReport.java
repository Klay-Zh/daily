package com.yiche.voicesms.model;

import java.util.Date;

public class VoiceSmsStatusReport {
    private Long id;

    private String msgId;

    private String result;

    private Integer duration;

    private String callee;

    private Integer calledTimes;

    private String status;

    private String describe;

    private String pressKeys;

    private Date reportTime;

    private Date startTime;

    private Date answerTime;

    private Integer ringingTimeLong;

    private String recordUrl;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getCallee() {
        return callee;
    }

    public void setCallee(String callee) {
        this.callee = callee;
    }

    public Integer getCalledTimes() {
        return calledTimes;
    }

    public void setCalledTimes(Integer calledTimes) {
        this.calledTimes = calledTimes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getPressKeys() {
        return pressKeys;
    }

    public void setPressKeys(String pressKeys) {
        this.pressKeys = pressKeys;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(Date answerTime) {
        this.answerTime = answerTime;
    }

    public Integer getRingingTimeLong() {
        return ringingTimeLong;
    }

    public void setRingingTimeLong(Integer ringingTimeLong) {
        this.ringingTimeLong = ringingTimeLong;
    }

    public String getRecordUrl() {
        return recordUrl;
    }

    public void setRecordUrl(String recordUrl) {
        this.recordUrl = recordUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}