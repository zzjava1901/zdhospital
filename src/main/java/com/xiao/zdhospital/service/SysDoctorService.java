package com.xiao.zdhospital.service;

import com.xiao.zdhospital.entity.SysDoctor;

import java.util.List;

public interface SysDoctorService {
    public List<SysDoctor> findAll();
    public List<SysDoctor> findByIid(int iId);
}
