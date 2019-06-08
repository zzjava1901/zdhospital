package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysDoctor;

import javax.print.Doc;
import javax.tools.DocumentationTool;
import java.util.List;

public interface SysDoctorMapper {
    int deleteByPrimaryKey(Integer docId);

    int insert(SysDoctor record);

    int insertSelective(SysDoctor record);

    SysDoctor selectByPrimaryKey(Integer docId);

    int updateByPrimaryKeySelective(SysDoctor record);

    int updateByPrimaryKey(SysDoctor record);

    public List<SysDoctor> findAll();

    public List<SysDoctor> findByIid(int iId);

}