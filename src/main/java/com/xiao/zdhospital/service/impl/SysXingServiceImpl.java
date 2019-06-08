package com.xiao.zdhospital.service.impl;

import com.xiao.zdhospital.dao.SysIllbedMapper;
import com.xiao.zdhospital.dao.SysXingMapper;
import com.xiao.zdhospital.entity.SysIllbed;
import com.xiao.zdhospital.entity.SysXing;
import com.xiao.zdhospital.service.SysIllbedService;
import com.xiao.zdhospital.service.SysXingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysXingServiceImpl implements SysXingService {

    @Autowired
    private SysXingMapper xingDao;


    @Override
    public List<SysXing> findAll(int tid) {
        return xingDao.findAll(tid);
    }
}
