package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysClass;

public interface SysClassMapper {
    int deleteByPrimaryKey(Integer clId);

    int insert(SysClass record);

    int insertSelective(SysClass record);

    SysClass selectByPrimaryKey(Integer clId);

    int updateByPrimaryKeySelective(SysClass record);

    int updateByPrimaryKeyWithBLOBs(SysClass record);

    int updateByPrimaryKey(SysClass record);
}