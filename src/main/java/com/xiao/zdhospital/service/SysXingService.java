package com.xiao.zdhospital.service;

import com.xiao.zdhospital.entity.SysIllbed;
import com.xiao.zdhospital.entity.SysXing;

import java.util.List;

public interface SysXingService {
    public List<SysXing> findAll(int tid);
}
