package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.entity.SysHealth;
import com.xiao.zdhospital.service.SysHealthService;
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
@RequestMapping("/sysHealth")
public class SysHealthController {

    @Autowired
    private SysHealthService healthService;

    @ApiOperation(value = "查询健康家园",notes = "这是一个查询健康家园的数据")
    @RequestMapping(value = "find.do",method = RequestMethod.GET)
    public R find(int tid){
        List<SysHealth> list = healthService.find(tid);
        return R.setOK("OK", list);
    }
}
