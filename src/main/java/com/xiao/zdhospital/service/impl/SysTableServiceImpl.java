package com.xiao.zdhospital.service.impl;

import com.github.pagehelper.PageHelper;
import com.xiao.zdhospital.dao.SysTableMapper;
import com.xiao.zdhospital.entity.SysTable;
import com.xiao.zdhospital.service.SysTableService;
import com.xiao.zdhospital.utils.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysTableServiceImpl implements SysTableService {
    @Autowired
    private SysTableMapper tableDao;


    @Override
    public Map<String, Object> findAll(int page) {
        PageHelper.startPage(page,5);
        List<SysTable> list = tableDao.findAll();


        return Paging.paging(list);
    }
}
