package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysIllbed;

public interface SysIllbedMapper {
    int deleteByPrimaryKey(Integer iid);

    int insert(SysIllbed record);

    int insertSelective(SysIllbed record);

    SysIllbed selectByPrimaryKey(Integer iid);

    int updateByPrimaryKeySelective(SysIllbed record);

    int updateByPrimaryKey(SysIllbed record);
}