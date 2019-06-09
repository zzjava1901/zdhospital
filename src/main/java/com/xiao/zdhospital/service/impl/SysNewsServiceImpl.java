package com.xiao.zdhospital.service.impl;

import com.github.pagehelper.PageHelper;
import com.xiao.zdhospital.dao.SysNewsMapper;
import com.xiao.zdhospital.entity.SysNews;
import com.xiao.zdhospital.service.SysNewsService;
import com.xiao.zdhospital.utils.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysNewsServiceImpl implements SysNewsService{

    @Autowired(required = false)
    private SysNewsMapper newsDao;
    @Override
    public Map<String, Object> findAll(int page) {

        PageHelper.startPage(page,5);
        List<SysNews> list = newsDao.findAll();

        return Paging.paging(list);
    }
}
