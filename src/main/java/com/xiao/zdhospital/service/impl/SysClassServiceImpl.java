package com.xiao.zdhospital.service.impl;

import com.github.pagehelper.PageHelper;
import com.xiao.zdhospital.dao.SysClassMapper;
import com.xiao.zdhospital.entity.SysClass;
import com.xiao.zdhospital.service.SysClassService;
import com.xiao.zdhospital.utils.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class SysClassServiceImpl implements SysClassService {

    @Autowired
    private SysClassMapper classDao;

    @Override
    public Map<String, Object> findAll(int heId, int page) {
        PageHelper.startPage(page, 5);
        List<SysClass> list = classDao.findAll(heId);

        return Paging.paging(list);
    }
}
