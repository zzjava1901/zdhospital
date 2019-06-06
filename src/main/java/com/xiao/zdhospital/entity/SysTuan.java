package com.xiao.zdhospital.entity;

import java.util.Date;

public class SysTuan {
    private Integer tuanId;

    private String ttitle;

    private Date tdate;

    private String tpath;

    public Integer getTuanId() {
        return tuanId;
    }

    public void setTuanId(Integer tuanId) {
        this.tuanId = tuanId;
    }

    public String getTtitle() {
        return ttitle;
    }

    public void setTtitle(String ttitle) {
        this.ttitle = ttitle == null ? null : ttitle.trim();
    }

    public Date getTdate() {
        return tdate;
    }

    public void setTdate(Date tdate) {
        this.tdate = tdate;
    }

    public String getTpath() {
        return tpath;
    }

    public void setTpath(String tpath) {
        this.tpath = tpath == null ? null : tpath.trim();
    }
}