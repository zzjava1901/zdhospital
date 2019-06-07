package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.entity.SysTitle;
import com.xiao.zdhospital.service.SysTitleService;
import com.xiao.zdhospital.vo.R;
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




}
