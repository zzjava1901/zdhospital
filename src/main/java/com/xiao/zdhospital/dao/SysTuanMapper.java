package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysTuan;

public interface SysTuanMapper {
    int deleteByPrimaryKey(Integer tuanId);

    int insert(SysTuan record);

    int insertSelective(SysTuan record);

    SysTuan selectByPrimaryKey(Integer tuanId);

    int updateByPrimaryKeySelective(SysTuan record);

    int updateByPrimaryKeyWithBLOBs(SysTuan record);

    int updateByPrimaryKey(SysTuan record);
}