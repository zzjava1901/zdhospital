package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysLeader;

import java.util.List;

public interface SysLeaderMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(SysLeader record);

    int insertSelective(SysLeader record);

    SysLeader selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(SysLeader record);

    int updateByPrimaryKey(SysLeader record);

    public List<SysLeader> findAll();
}