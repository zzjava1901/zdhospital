package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysXing;

public interface SysXingMapper {
    int deleteByPrimaryKey(Integer xid);

    int insert(SysXing record);

    int insertSelective(SysXing record);

    SysXing selectByPrimaryKey(Integer xid);

    int updateByPrimaryKeySelective(SysXing record);

    int updateByPrimaryKey(SysXing record);
}