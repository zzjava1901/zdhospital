package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.entity.SysInner;
import com.xiao.zdhospital.service.SysInnerService;
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
@RequestMapping("/sysInner")
public class SysInnerController {

    @Autowired
    private SysInnerService innerService;

    @ApiOperation(value = "查询内科",notes = "这是一个查询内科的数据")
    @RequestMapping(value = "find.do",method = RequestMethod.GET)
    public R find(int iId){
        List<SysInner> list = innerService.find(iId);
        return R.setOK("OK", list);
    }
}
