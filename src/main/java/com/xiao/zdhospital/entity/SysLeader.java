package com.xiao.zdhospital.entity;

public class SysLeader {
    private Integer lid;

    private String lname;

    private String limg;

    private String linfo;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname == null ? null : lname.trim();
    }

    public String getLimg() {
        return limg;
    }

    public void setLimg(String limg) {
        this.limg = limg == null ? null : limg.trim();
    }

    public String getLinfo() {
        return linfo;
    }

    public void setLinfo(String linfo) {
        this.linfo = linfo == null ? null : linfo.trim();
    }
}