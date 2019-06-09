package com.xiao.zdhospital.service.impl;

import com.xiao.zdhospital.dao.SysInnerMapper;
import com.xiao.zdhospital.entity.SysInner;
import com.xiao.zdhospital.service.SysInnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysInnerServiceImpl implements SysInnerService {

    @Autowired
    private SysInnerMapper innerDao;

    @Override
    public List<SysInner> find(int iId) {

        return innerDao.find(iId);
    }
}
