package com.xiao.zdhospital.service.impl;

import com.xiao.zdhospital.dao.SysDoctorMapper;
import com.xiao.zdhospital.entity.SysDoctor;
import com.xiao.zdhospital.service.SysDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysDoctorServiceImpl implements SysDoctorService {
    @Autowired
    private SysDoctorMapper doctorDao;
    @Override
    public List<SysDoctor> findAll() {
        return doctorDao.findAll();
    }

    @Override
    public List<SysDoctor> findByIid(int iId) {

        return doctorDao.findByIid(iId);
    }
}
