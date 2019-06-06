package com.xiao.zdhospital.dao;

import com.xiao.zdhospital.entity.SysNotice;

public interface SysNoticeMapper {
    int deleteByPrimaryKey(Integer nid);

    int insert(SysNotice record);

    int insertSelective(SysNotice record);

    SysNotice selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(SysNotice record);

    int updateByPrimaryKeyWithBLOBs(SysNotice record);

    int updateByPrimaryKey(SysNotice record);
}