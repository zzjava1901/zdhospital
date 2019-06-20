package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysActive;

import java.util.List;

public interface SysActiveMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(SysActive record);

    int insertSelective(SysActive record);

    SysActive selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(SysActive record);

    int updateByPrimaryKeyWithBLOBs(SysActive record);

    int updateByPrimaryKey(SysActive record);

    public List<SysActive> findAll();
}