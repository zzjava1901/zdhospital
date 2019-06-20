package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.entity.SysTitle;
import com.xiao.zdhospital.service.SysTitleService;
import com.xiao.zdhospital.vo.R;
import com.xiao.zdhospital.vo.VMeInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api
@RestController
@RequestMapping("/sysTitle")
public class SysTitleController {

@Autowired
    private SysTitleService titleService;

    @ApiOperation(value = "菜单展示", notes = "这是一个菜单展示")
    @RequestMapping(value = "menu.do", method = RequestMethod.GET)
    public R  showMenu(int titleFlag){
        List<SysTitle> list = titleService.menu(titleFlag);
        return R.setOK("OK",list);
    }

    @ApiOperation(value = "二级菜单展示", notes = "这是一个二级菜单展示")
    @RequestMapping(value = "submenu.do", method = RequestMethod.GET)
    public R  showSubMenu(int titleFuId){
        List<SysTitle> list = titleService.submenu(titleFuId);
        return R.setOK("OK",list);
    }

    @ApiOperation(value = "一级二级菜单展示", notes = "这是一个菜单展示")
    @RequestMapping(value = "findAllMenu.do", method = RequestMethod.GET)
    public R  showAllMenu(){
        List<VMeInfo> Menulist = titleService.findAllList();
        return R.setOK("OK",Menulist);
    }


}
