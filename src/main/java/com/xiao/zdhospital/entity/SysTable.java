package com.xiao.zdhospital.entity;

import java.util.Date;

public class SysTable {
    private Integer tableId;

    private Date datetime;

    private String tablePath;

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getTablePath() {
        return tablePath;
    }

    public void setTablePath(String tablePath) {
        this.tablePath = tablePath == null ? null : tablePath.trim();
    }
}