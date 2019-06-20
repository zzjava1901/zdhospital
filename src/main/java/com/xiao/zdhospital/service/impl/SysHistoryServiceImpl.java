package com.xiao.zdhospital.service.impl;

import com.github.pagehelper.PageHelper;
import com.xiao.zdhospital.dao.SysHistoryMapper;
import com.xiao.zdhospital.entity.SysHistory;
import com.xiao.zdhospital.service.SysHistoryService;
import com.xiao.zdhospital.utils.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class SysHistoryServiceImpl implements SysHistoryService {
    @Autowired(required = false)
    private SysHistoryMapper historyDao;
    @Override
    public Map<String, Object> findAll(int page) {

        PageHelper.startPage(page,5);
        List<SysHistory> list = historyDao.findAll();
        return Paging.paging(list);
    }
}
