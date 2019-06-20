package com.xiao.zdhospital.service.impl;

import com.github.pagehelper.PageHelper;
import com.xiao.zdhospital.dao.SysFocusMapper;
import com.xiao.zdhospital.entity.SysFocus;
import com.xiao.zdhospital.service.SysFocusService;
import com.xiao.zdhospital.utils.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysFocusServiceImpl implements SysFocusService{

    @Autowired(required = false)
    private SysFocusMapper focusDao;
    @Override
    public Map<String, Object> findAll(int page) {

        PageHelper.startPage(page,5);
        List<SysFocus> list = focusDao.findAll();

        return Paging.paging(list);
    }
}
