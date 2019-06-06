package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysBianpe;

public interface SysBianpeMapper {
    int deleteByPrimaryKey(Integer bpId);

    int insert(SysBianpe record);

    int insertSelective(SysBianpe record);

    SysBianpe selectByPrimaryKey(Integer bpId);

    int updateByPrimaryKeySelective(SysBianpe record);

    int updateByPrimaryKey(SysBianpe record);
}