package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysBianpe;

import java.util.List;

public interface SysBianpeMapper {
    int deleteByPrimaryKey(Integer bpId);

    int insert(SysBianpe record);

    int insertSelective(SysBianpe record);

    SysBianpe selectByPrimaryKey(Integer bpId);

    int updateByPrimaryKeySelective(SysBianpe record);

    int updateByPrimaryKey(SysBianpe record);

    public List<SysBianpe> find(int tid);

}