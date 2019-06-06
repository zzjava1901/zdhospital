package com.xiao.zdhospital.entity;

import java.util.Date;

public class SysActive {
    private Integer aid;

    private String atitle;

    private Date adate;

    private String apath;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAtitle() {
        return atitle;
    }

    public void setAtitle(String atitle) {
        this.atitle = atitle == null ? null : atitle.trim();
    }

    public Date getAdate() {
        return adate;
    }

    public void setAdate(Date adate) {
        this.adate = adate;
    }

    public String getApath() {
        return apath;
    }

    public void setApath(String apath) {
        this.apath = apath == null ? null : apath.trim();
    }
}