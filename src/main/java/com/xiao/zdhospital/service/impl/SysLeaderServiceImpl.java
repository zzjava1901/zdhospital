package com.xiao.zdhospital.service.impl;

import com.github.pagehelper.PageHelper;
import com.xiao.zdhospital.dao.SysLeaderMapper;
import com.xiao.zdhospital.entity.SysLeader;
import com.xiao.zdhospital.service.SysLeaderService;
import com.xiao.zdhospital.utils.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysLeaderServiceImpl implements SysLeaderService {

    @Autowired
    private SysLeaderMapper leaderDao;


    @Override
    public Map<String, Object> findAll(int page) {
        PageHelper.startPage(page,5);
        List<SysLeader> list = leaderDao.findAll();

        return Paging.paging(list);
    }
}
