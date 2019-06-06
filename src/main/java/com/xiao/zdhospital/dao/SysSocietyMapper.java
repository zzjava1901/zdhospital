package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysSociety;

public interface SysSocietyMapper {
    int deleteByPrimaryKey(Integer societyId);

    int insert(SysSociety record);

    int insertSelective(SysSociety record);

    SysSociety selectByPrimaryKey(Integer societyId);

    int updateByPrimaryKeySelective(SysSociety record);

    int updateByPrimaryKey(SysSociety record);
}