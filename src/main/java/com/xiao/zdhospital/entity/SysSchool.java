package com.xiao.zdhospital.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SysSchool {
    private Integer schoolId;

    private String jobname;

    private Integer num;

    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",timezone="GMT + 8")
    private Date datetime;

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
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