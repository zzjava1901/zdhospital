package com.xiao.zdhospital.entity;

public class SysBianpe {
    private Integer bpId;

    private String bpName;

    private String bpUrl;

    private Integer tId;

    public Integer getBpId() {
        return bpId;
    }

    public void setBpId(Integer bpId) {
        this.bpId = bpId;
    }

    public String getBpName() {
        return bpName;
    }

    public void setBpName(String bpName) {
        this.bpName = bpName == null ? null : bpName.trim();
    }

    public String getBpUrl() {
        return bpUrl;
    }

    public void setBpUrl(String bpUrl) {
        this.bpUrl = bpUrl == null ? null : bpUrl.trim();
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }
}