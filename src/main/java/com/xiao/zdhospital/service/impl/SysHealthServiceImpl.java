package com.xiao.zdhospital.service.impl;

import com.xiao.zdhospital.dao.SysHealthMapper;
import com.xiao.zdhospital.entity.SysHealth;
import com.xiao.zdhospital.service.SysHealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysHealthServiceImpl implements SysHealthService {

    @Autowired
    private SysHealthMapper healthDao;


    @Override
    public List<SysHealth> find(int tid) {
        return healthDao.find(tid);
    }
}
