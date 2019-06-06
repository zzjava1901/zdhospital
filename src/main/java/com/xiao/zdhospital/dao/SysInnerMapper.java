package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysInner;

public interface SysInnerMapper {
    int deleteByPrimaryKey(Integer innerId);

    int insert(SysInner record);

    int insertSelective(SysInner record);

    SysInner selectByPrimaryKey(Integer innerId);

    int updateByPrimaryKeySelective(SysInner record);

    int updateByPrimaryKey(SysInner record);
}