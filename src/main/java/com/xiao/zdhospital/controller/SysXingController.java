package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.entity.SysIllbed;
import com.xiao.zdhospital.entity.SysXing;
import com.xiao.zdhospital.service.SysIllbedService;
import com.xiao.zdhospital.service.SysXingService;
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
@RequestMapping("/sysXing")
public class SysXingController {
    @Autowired
    private SysXingService xingService;

    @ApiOperation(value = "行政科室展示",notes = "这是一个行政医科的展示")
    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public R findAll(int tid){
        List<SysXing> list = xingService.findAll(tid);
        return R.setOK("OK",list);
    }



}
