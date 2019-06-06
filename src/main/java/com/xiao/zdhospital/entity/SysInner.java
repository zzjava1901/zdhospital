package com.xiao.zdhospital.entity;

public class SysInner {
    private Integer innerId;

    private String inenerInfo;

    private Integer iid;

    private Integer doctorId;

    public Integer getInnerId() {
        return innerId;
    }

    public void setInnerId(Integer innerId) {
        this.innerId = innerId;
    }

    public String getInenerInfo() {
        return inenerInfo;
    }

    public void setInenerInfo(String inenerInfo) {
        this.inenerInfo = inenerInfo == null ? null : inenerInfo.trim();
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }
}