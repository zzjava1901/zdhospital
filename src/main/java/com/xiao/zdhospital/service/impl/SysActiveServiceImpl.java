package com.xiao.zdhospital.service.impl;

import com.github.pagehelper.PageHelper;
import com.xiao.zdhospital.dao.SysActiveMapper;
import com.xiao.zdhospital.entity.SysActive;
import com.xiao.zdhospital.service.SysActiveService;
import com.xiao.zdhospital.utils.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysActiveServiceImpl implements SysActiveService {

    @Autowired(required = false)
    private SysActiveMapper activeDao;
    @Override
    public Map<String, Object> findAll(int page) {

        PageHelper.startPage(page,5);
        List<SysActive> list = activeDao.findAll();
        return Paging.paging(list);
    }
}
