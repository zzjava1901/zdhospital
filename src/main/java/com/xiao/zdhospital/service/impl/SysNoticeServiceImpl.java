package com.xiao.zdhospital.service.impl;

import com.github.pagehelper.PageHelper;
import com.xiao.zdhospital.dao.SysNoticeMapper;
import com.xiao.zdhospital.entity.SysNotice;
import com.xiao.zdhospital.service.SysNoticeService;
import com.xiao.zdhospital.utils.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysNoticeServiceImpl implements SysNoticeService {

    @Autowired(required = false)
    private SysNoticeMapper noticeDao;
    @Override
    public Map<String, Object> findAll(int page) {

        PageHelper.startPage(page,5);
        List<SysNotice> list = noticeDao.findAll();

        return Paging.paging(list);
    }
}
