package com.xiao.zdhospital.service.impl;

import com.github.pagehelper.PageHelper;
import com.xiao.zdhospital.dao.SysDangMapper;
import com.xiao.zdhospital.dao.SysTuanMapper;
import com.xiao.zdhospital.entity.SysDang;
import com.xiao.zdhospital.entity.SysTuan;
import com.xiao.zdhospital.service.SysDangService;
import com.xiao.zdhospital.service.SysTuanService;
import com.xiao.zdhospital.utils.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysTuanServiceImpl implements SysTuanService {


    @Autowired
    private SysTuanMapper tuanDao;

    @Override
    public Map<String, Object> findAll(int page) {
        PageHelper.startPage(page,5);
        List<SysTuan> list = tuanDao.findAll();
        return Paging.paging(list);
    }
}
