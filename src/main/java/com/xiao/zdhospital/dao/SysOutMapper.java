package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysOut;

public interface SysOutMapper {
    int deleteByPrimaryKey(Integer outId);

    int insert(SysOut record);

    int insertSelective(SysOut record);

    SysOut selectByPrimaryKey(Integer outId);

    int updateByPrimaryKeySelective(SysOut record);

    int updateByPrimaryKey(SysOut record);
}