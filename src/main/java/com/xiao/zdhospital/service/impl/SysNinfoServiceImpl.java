package com.xiao.zdhospital.service.impl;

import com.github.pagehelper.PageHelper;
import com.xiao.zdhospital.dao.SysNinfoMapper;
import com.xiao.zdhospital.entity.SysNinfo;
import com.xiao.zdhospital.service.SysNinfoService;
import com.xiao.zdhospital.utils.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysNinfoServiceImpl implements SysNinfoService {
    @Autowired
    private SysNinfoMapper ninfoDao;


    @Override
    public Map<String, Object> findAll(int page) {
        PageHelper.startPage(page,5);
        List<SysNinfo> list = ninfoDao.findAll();


        return Paging.paging(list);
    }
}
