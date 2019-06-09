package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysOut;

import java.util.List;

public interface SysOutMapper {
    int deleteByPrimaryKey(Integer outId);

    int insert(SysOut record);

    int insertSelective(SysOut record);

    SysOut selectByPrimaryKey(Integer outId);

    int updateByPrimaryKeySelective(SysOut record);

    int updateByPrimaryKey(SysOut record);

    public List<SysOut> find(int iId);
}