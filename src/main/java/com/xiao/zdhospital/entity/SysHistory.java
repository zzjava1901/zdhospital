package com.xiao.zdhospital.entity;

import java.util.Date;

public class SysHistory {
    private Integer hid;

    private String htitle;

    private Date hdate;

    private String hpath;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getHtitle() {
        return htitle;
    }

    public void setHtitle(String htitle) {
        this.htitle = htitle == null ? null : htitle.trim();
    }

    public Date getHdate() {
        return hdate;
    }

    public void setHdate(Date hdate) {
        this.hdate = hdate;
    }

    public String getHpath() {
        return hpath;
    }

    public void setHpath(String hpath) {
        this.hpath = hpath == null ? null : hpath.trim();
    }
}