package com.xiao.zdhospital.service.impl;

import com.xiao.zdhospital.dao.SysStaffMapper;
import com.xiao.zdhospital.entity.SysStaff;
import com.xiao.zdhospital.service.SysStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysStaffServiceImpl implements SysStaffService {

    @Autowired
    private SysStaffMapper staffDao;

    @Override
    public List<SysStaff> find(int xId) {

        return staffDao.find(xId);
    }
}
