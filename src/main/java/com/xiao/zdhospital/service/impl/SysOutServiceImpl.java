package com.xiao.zdhospital.service.impl;

import com.xiao.zdhospital.dao.SysOutMapper;
import com.xiao.zdhospital.entity.SysOut;
import com.xiao.zdhospital.service.SysOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysOutServiceImpl implements SysOutService {

    @Autowired
    private SysOutMapper outDao;

    @Override
    public List<SysOut> find(int iId) {

        return outDao.find(iId);
    }
}
