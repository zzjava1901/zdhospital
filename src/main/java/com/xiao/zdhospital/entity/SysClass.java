package com.xiao.zdhospital.entity;

import java.util.Date;

public class SysClass {
    private Integer clId;

    private String clTitle;

    private Date clDate;

    private Integer heId;

    private String clPath;

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }

    public String getClTitle() {
        return clTitle;
    }

    public void setClTitle(String clTitle) {
        this.clTitle = clTitle == null ? null : clTitle.trim();
    }

    public Date getClDate() {
        return clDate;
    }

    public void setClDate(Date clDate) {
        this.clDate = clDate;
    }

    public Integer getHeId() {
        return heId;
    }

    public void setHeId(Integer heId) {
        this.heId = heId;
    }

    public String getClPath() {
        return clPath;
    }

    public void setClPath(String clPath) {
        this.clPath = clPath == null ? null : clPath.trim();
    }
}