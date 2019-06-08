package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysSchool;

import java.util.List;

public interface SysSchoolMapper {
    int deleteByPrimaryKey(Integer schoolId);

    int insert(SysSchool record);

    int insertSelective(SysSchool record);

    SysSchool selectByPrimaryKey(Integer schoolId);

    int updateByPrimaryKeySelective(SysSchool record);

    int updateByPrimaryKey(SysSchool record);

    public List<SysSchool> findAll();

    public int count();



}