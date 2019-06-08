package com.xiao.zdhospital.service.impl;

import com.sun.xml.internal.bind.v2.model.core.ReferencePropertyInfo;
import com.xiao.zdhospital.dao.SysIllbedMapper;
import com.xiao.zdhospital.entity.SysIllbed;
import com.xiao.zdhospital.service.SysIllbedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysIllbedServiceImpl implements SysIllbedService {

    @Autowired
    private SysIllbedMapper illbedDao;


    @Override
    public List<SysIllbed> findAll(int tid) {
        return illbedDao.findAll(tid);
    }
}
