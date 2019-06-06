package com.xiao.zdhospital.entity;

public class SysHealth {
    private Integer heId;

    private String heName;

    private String heUrl;

    private Integer tId;

    public Integer getHeId() {
        return heId;
    }

    public void setHeId(Integer heId) {
        this.heId = heId;
    }

    public String getHeName() {
        return heName;
    }

    public void setHeName(String heName) {
        this.heName = heName == null ? null : heName.trim();
    }

    public String getHeUrl() {
        return heUrl;
    }

    public void setHeUrl(String heUrl) {
        this.heUrl = heUrl == null ? null : heUrl.trim();
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }
}