package com.xiao.zdhospital.entity;

import java.util.Date;

public class SysDang {
    private Integer did;

    private String dtitle;

    private Date ddate;

    private String dpath;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDtitle() {
        return dtitle;
    }

    public void setDtitle(String dtitle) {
        this.dtitle = dtitle == null ? null : dtitle.trim();
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    public String getDpath() {
        return dpath;
    }

    public void setDpath(String dpath) {
        this.dpath = dpath == null ? null : dpath.trim();
    }
}