package com.xiao.zdhospital.service.impl;

import com.xiao.zdhospital.dao.SysBianpeMapper;
import com.xiao.zdhospital.entity.SysBianpe;
import com.xiao.zdhospital.service.SysBianpeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysBianpeServiceImpl implements SysBianpeService {

    @Autowired
    private SysBianpeMapper bianpeDao;

    @Override
    public List<SysBianpe> find(int tid) {
        return bianpeDao.find(tid);
    }
}
