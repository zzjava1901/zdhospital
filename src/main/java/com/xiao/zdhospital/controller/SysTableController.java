package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.service.SysTableService;
import com.xiao.zdhospital.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Api
@RestController
@RequestMapping("/sysTable")

public class SysTableController {

    @Autowired
    private SysTableService tableService;

    @ApiOperation(value = "查询所有招聘公告表格",notes = "这是一个查询所有招聘公告表格")
    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public R findAll(int page){
        Map<String, Object> map = tableService.findAll(page);
        return R.setOK("OK",map);
    }






}
