package com.yiche.voicesms.model;

import java.util.Date;

public class GatedLaunchPOJO {
    private Integer id;

    private String gatedKey;

    private Date updateTime;

    private String gatedLaunchInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGatedKey() {
        return gatedKey;
    }

    public void setGatedKey(String gatedKey) {
        this.gatedKey = gatedKey;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getGatedLaunchInfo() {
        return gatedLaunchInfo;
    }

    public void setGatedLaunchInfo(String gatedLaunchInfo) {
        this.gatedLaunchInfo = gatedLaunchInfo;
    }
}