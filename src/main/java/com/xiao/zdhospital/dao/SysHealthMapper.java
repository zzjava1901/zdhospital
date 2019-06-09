package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysHealth;

import java.util.List;

public interface SysHealthMapper {
    int deleteByPrimaryKey(Integer heId);

    int insert(SysHealth record);

    int insertSelective(SysHealth record);

    SysHealth selectByPrimaryKey(Integer heId);

    int updateByPrimaryKeySelective(SysHealth record);

    int updateByPrimaryKey(SysHealth record);
    public List<SysHealth> find(int tid);

}