package com.xiao.zdhospital.service.impl;

import com.xiao.zdhospital.dao.SysTitleMapper;
import com.xiao.zdhospital.entity.SysTitle;
import com.xiao.zdhospital.service.SysTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysTitleServiceImpl implements SysTitleService {
@Autowired
private SysTitleMapper titleDao;

    @Override
    public List<SysTitle> menu(int titleFlag) {
        List<SysTitle> list = titleDao.menu(titleFlag);



        return list;

    }

    @Override
    public List<SysTitle> submenu(int titleFuId) {

        return titleDao.submenu(titleFuId);
    }
}
