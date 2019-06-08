package com.xiao.zdhospital.service;

import com.xiao.zdhospital.entity.SysDoctor;
import com.xiao.zdhospital.entity.SysSchool;

import java.util.List;
import java.util.Map;

public interface SysSchoolService {
    public Map<String,Object> findAll(int page);

}
