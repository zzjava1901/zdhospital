package com.xiao.zdhospital.service.impl;

import com.github.pagehelper.PageHelper;
import com.xiao.zdhospital.dao.SysSocietyMapper;
import com.xiao.zdhospital.entity.SysSociety;
import com.xiao.zdhospital.service.SysSocietyService;
import com.xiao.zdhospital.utils.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysSocietyServiceImpl implements SysSocietyService {
    @Autowired
    private SysSocietyMapper societyDao;


    @Override
    public Map<String, Object> findAll(int page) {
        PageHelper.startPage(page,5);
        List<SysSociety> list = societyDao.findAll();


        return Paging.paging(list);
    }
}
