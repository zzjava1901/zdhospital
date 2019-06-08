package com.xiao.zdhospital.service;

import com.xiao.zdhospital.entity.SysIllbed;

import java.util.List;

public interface SysIllbedService {
    public List<SysIllbed> findAll(int tid);
}
