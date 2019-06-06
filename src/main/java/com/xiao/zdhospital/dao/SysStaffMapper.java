package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysStaff;

public interface SysStaffMapper {
    int deleteByPrimaryKey(Integer staffId);

    int insert(SysStaff record);

    int insertSelective(SysStaff record);

    SysStaff selectByPrimaryKey(Integer staffId);

    int updateByPrimaryKeySelective(SysStaff record);

    int updateByPrimaryKey(SysStaff record);
}