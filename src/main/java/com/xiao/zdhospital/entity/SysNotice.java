package com.xiao.zdhospital.entity;

import java.util.Date;

public class SysNotice {
    private Integer nid;

    private String ntitle;

    private Date ndate;

    private String npath;

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle == null ? null : ntitle.trim();
    }

    public Date getNdate() {
        return ndate;
    }

    public void setNdate(Date ndate) {
        this.ndate = ndate;
    }

    public String getNpath() {
        return npath;
    }

    public void setNpath(String npath) {
        this.npath = npath == null ? null : npath.trim();
    }
}