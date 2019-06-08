package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysTitle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysTitleMapper {
    int deleteByPrimaryKey(Integer titleId);

    int insert(SysTitle record);

    int insertSelective(SysTitle record);

    SysTitle selectByPrimaryKey(Integer titleId);

    int updateByPrimaryKeySelective(SysTitle record);

    int updateByPrimaryKey(SysTitle record);

    public List<SysTitle> menu(int titleFlag);

    public List<SysTitle> submenu(int titleFuId);

}