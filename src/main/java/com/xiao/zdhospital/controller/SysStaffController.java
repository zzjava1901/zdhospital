package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.entity.SysStaff;
import com.xiao.zdhospital.service.SysStaffService;
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
@RequestMapping("/sysStaff")
public class SysStaffController {

    @Autowired
    private SysStaffService staffService;

    @ApiOperation(value = "查询人事科",notes = "这是一个查询人事科的信息")
    @RequestMapping(value = "find.do",method = RequestMethod.GET)
    public R find(int xId){
        List<SysStaff> list = staffService.find(xId);
        return R.setOK("OK", list);
    }
}
