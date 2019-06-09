package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysFocus;

import java.util.List;

public interface SysFocusMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(SysFocus record);

    int insertSelective(SysFocus record);

    SysFocus selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(SysFocus record);

    int updateByPrimaryKeyWithBLOBs(SysFocus record);

    int updateByPrimaryKey(SysFocus record);

    public List<SysFocus> findAll();
}