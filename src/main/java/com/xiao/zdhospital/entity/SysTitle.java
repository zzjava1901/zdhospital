package com.xiao.zdhospital.entity;

public class SysTitle {
    private Integer titleId;

    private Integer titleFuId;

    private String titleName;

    private String titleUrl;

    private Integer titleFlag;

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public Integer getTitleFuId() {
        return titleFuId;
    }

    public void setTitleFuId(Integer titleFuId) {
        this.titleFuId = titleFuId;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName == null ? null : titleName.trim();
    }

    public String getTitleUrl() {
        return titleUrl;
    }

    public void setTitleUrl(String titleUrl) {
        this.titleUrl = titleUrl == null ? null : titleUrl.trim();
    }

    public Integer getTitleFlag() {
        return titleFlag;
    }

    public void setTitleFlag(Integer titleFlag) {
        this.titleFlag = titleFlag;
    }
}