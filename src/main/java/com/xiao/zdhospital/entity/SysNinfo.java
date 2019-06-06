package com.xiao.zdhospital.entity;

import java.util.Date;

public class SysNinfo {
    private Integer niId;

    private String niTitle;

    private Date niDate;

    private String niText;

    public Integer getNiId() {
        return niId;
    }

    public void setNiId(Integer niId) {
        this.niId = niId;
    }

    public String getNiTitle() {
        return niTitle;
    }

    public void setNiTitle(String niTitle) {
        this.niTitle = niTitle == null ? null : niTitle.trim();
    }

    public Date getNiDate() {
        return niDate;
    }

    public void setNiDate(Date niDate) {
        this.niDate = niDate;
    }

    public String getNiText() {
        return niText;
    }

    public void setNiText(String niText) {
        this.niText = niText == null ? null : niText.trim();
    }
}