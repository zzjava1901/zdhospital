package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysTable;

import java.util.List;

public interface SysTableMapper {
    int deleteByPrimaryKey(Integer tableId);

    int insert(SysTable record);

    int insertSelective(SysTable record);

    SysTable selectByPrimaryKey(Integer tableId);

    int updateByPrimaryKeySelective(SysTable record);

    int updateByPrimaryKeyWithBLOBs(SysTable record);

    int updateByPrimaryKey(SysTable record);

    public List<SysTable> findAll();
}