package com.xiao.zdhospital.service.impl;

import com.github.pagehelper.PageHelper;
import com.xiao.zdhospital.dao.SysDoctorMapper;
import com.xiao.zdhospital.dao.SysSchoolMapper;
import com.xiao.zdhospital.entity.SysDoctor;
import com.xiao.zdhospital.entity.SysSchool;
import com.xiao.zdhospital.service.SysDoctorService;
import com.xiao.zdhospital.service.SysSchoolService;
import com.xiao.zdhospital.utils.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysSchoolServiceImpl implements SysSchoolService {
    @Autowired
    private SysSchoolMapper schoolDao;


    @Override
    public Map<String, Object> findAll(int page) {
        PageHelper.startPage(page,5);
        List<SysSchool> list = schoolDao.findAll();


        return Paging.paging(list);
    }
}
