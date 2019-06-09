package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysNinfo;

import java.util.List;

public interface SysNinfoMapper {
    int deleteByPrimaryKey(Integer niId);

    int insert(SysNinfo record);

    int insertSelective(SysNinfo record);

    SysNinfo selectByPrimaryKey(Integer niId);

    int updateByPrimaryKeySelective(SysNinfo record);

    int updateByPrimaryKeyWithBLOBs(SysNinfo record);

    int updateByPrimaryKey(SysNinfo record);

    public List<SysNinfo> findAll();

}