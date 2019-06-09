package com.xiao.zdhospital.service;

import com.xiao.zdhospital.entity.SysHealth;

import java.util.List;

public interface SysHealthService {
    public List<SysHealth> find(int tid);
}
