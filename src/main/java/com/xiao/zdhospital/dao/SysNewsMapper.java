package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysNews;

public interface SysNewsMapper {
    int deleteByPrimaryKey(Integer newsId);

    int insert(SysNews record);

    int insertSelective(SysNews record);

    SysNews selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(SysNews record);

    int updateByPrimaryKeyWithBLOBs(SysNews record);

    int updateByPrimaryKey(SysNews record);
}