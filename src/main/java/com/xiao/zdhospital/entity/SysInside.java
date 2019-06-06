package com.xiao.zdhospital.entity;

import java.util.Date;

public class SysInside {
    private Integer insideId;

    private String jobname;

    private Integer num;

    private Date datetime;

    public Integer getInsideId() {
        return insideId;
    }

    public void setInsideId(Integer insideId) {
        this.insideId = insideId;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}