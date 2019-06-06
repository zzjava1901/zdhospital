package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysHistory;

public interface SysHistoryMapper {
    int deleteByPrimaryKey(Integer hid);

    int insert(SysHistory record);

    int insertSelective(SysHistory record);

    SysHistory selectByPrimaryKey(Integer hid);

    int updateByPrimaryKeySelective(SysHistory record);

    int updateByPrimaryKeyWithBLOBs(SysHistory record);

    int updateByPrimaryKey(SysHistory record);
}