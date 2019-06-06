package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysLeader;

public interface SysLeaderMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(SysLeader record);

    int insertSelective(SysLeader record);

    SysLeader selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(SysLeader record);

    int updateByPrimaryKey(SysLeader record);
}