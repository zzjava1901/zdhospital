package com.xiao.zdhospital.entity;

public class SysFast {
    private Integer fastId;

    private String fastInfo;

    private Integer iid;

    private Integer docterId;

    public Integer getFastId() {
        return fastId;
    }

    public void setFastId(Integer fastId) {
        this.fastId = fastId;
    }

    public String getFastInfo() {
        return fastInfo;
    }

    public void setFastInfo(String fastInfo) {
        this.fastInfo = fastInfo == null ? null : fastInfo.trim();
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getDocterId() {
        return docterId;
    }

    public void setDocterId(Integer docterId) {
        this.docterId = docterId;
    }
}