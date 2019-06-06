package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysSchool;

public interface SysSchoolMapper {
    int deleteByPrimaryKey(Integer schoolId);

    int insert(SysSchool record);

    int insertSelective(SysSchool record);

    SysSchool selectByPrimaryKey(Integer schoolId);

    int updateByPrimaryKeySelective(SysSchool record);

    int updateByPrimaryKey(SysSchool record);
}