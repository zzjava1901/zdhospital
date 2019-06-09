package com.xiao.zdhospital.service.impl;

import com.xiao.zdhospital.dao.SysFastMapper;
import com.xiao.zdhospital.entity.SysFast;
import com.xiao.zdhospital.service.SysFastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysFastServiceImpl implements SysFastService {

    @Autowired
    private SysFastMapper fastDao;

    @Override
    public List<SysFast> find(int iId) {

        return fastDao.find(iId);
    }
}
