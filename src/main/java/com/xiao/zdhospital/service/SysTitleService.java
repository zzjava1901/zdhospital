package com.xiao.zdhospital.service;

import com.xiao.zdhospital.entity.SysTitle;
import com.xiao.zdhospital.vo.VMeInfo;

import java.util.List;

public interface SysTitleService {
    public List<SysTitle> menu(int titleFlag);
    public List<SysTitle> submenu(int titleFuId);

    public List<VMeInfo> findAllList();

}
