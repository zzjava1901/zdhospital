package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysDang;

public interface SysDangMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(SysDang record);

    int insertSelective(SysDang record);

    SysDang selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(SysDang record);

    int updateByPrimaryKeyWithBLOBs(SysDang record);

    int updateByPrimaryKey(SysDang record);
}