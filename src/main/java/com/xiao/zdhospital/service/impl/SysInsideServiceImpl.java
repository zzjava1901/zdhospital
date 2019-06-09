package com.xiao.zdhospital.service.impl;

import com.github.pagehelper.PageHelper;
import com.xiao.zdhospital.dao.SysInsideMapper;
import com.xiao.zdhospital.entity.SysInside;
import com.xiao.zdhospital.service.SysInsideService;
import com.xiao.zdhospital.utils.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysInsideServiceImpl implements SysInsideService {
    @Autowired
    private SysInsideMapper insideDao;


    @Override
    public Map<String, Object> findAll(int page) {
        PageHelper.startPage(page,5);
        List<SysInside> list = insideDao.findAll();


        return Paging.paging(list);
    }
}
