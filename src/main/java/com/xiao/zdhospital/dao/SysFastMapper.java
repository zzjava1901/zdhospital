package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysFast;

public interface SysFastMapper {
    int deleteByPrimaryKey(Integer fastId);

    int insert(SysFast record);

    int insertSelective(SysFast record);

    SysFast selectByPrimaryKey(Integer fastId);

    int updateByPrimaryKeySelective(SysFast record);

    int updateByPrimaryKey(SysFast record);
}