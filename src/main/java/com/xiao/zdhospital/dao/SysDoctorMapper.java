package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysDoctor;

public interface SysDoctorMapper {
    int deleteByPrimaryKey(Integer docId);

    int insert(SysDoctor record);

    int insertSelective(SysDoctor record);

    SysDoctor selectByPrimaryKey(Integer docId);

    int updateByPrimaryKeySelective(SysDoctor record);

    int updateByPrimaryKey(SysDoctor record);
}