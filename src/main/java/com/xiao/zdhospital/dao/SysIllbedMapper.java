package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysIllbed;

import java.util.List;

public interface SysIllbedMapper {
    int deleteByPrimaryKey(Integer iid);

    int insert(SysIllbed record);

    int insertSelective(SysIllbed record);

    SysIllbed selectByPrimaryKey(Integer iid);

    int updateByPrimaryKeySelective(SysIllbed record);

    int updateByPrimaryKey(SysIllbed record);

    public List<SysIllbed> findAll(int tid);
}