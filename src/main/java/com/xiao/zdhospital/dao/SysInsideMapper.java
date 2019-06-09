package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysInside;

import java.util.List;

public interface SysInsideMapper {
    int deleteByPrimaryKey(Integer insideId);

    int insert(SysInside record);

    int insertSelective(SysInside record);

    SysInside selectByPrimaryKey(Integer insideId);

    int updateByPrimaryKeySelective(SysInside record);

    int updateByPrimaryKey(SysInside record);

    public List<SysInside> findAll();

}