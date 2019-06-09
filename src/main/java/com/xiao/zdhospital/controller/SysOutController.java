package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.entity.SysOut;
import com.xiao.zdhospital.service.SysOutService;
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
@RequestMapping("/sysOut")
public class SysOutController {

    @Autowired
    private SysOutService outService
            ;

    @ApiOperation(value = "查询外科",notes = "这是一个查询外科的数据")
    @RequestMapping(value = "find.do",method = RequestMethod.GET)
    public R find(int iId){
        List<SysOut> list = outService.find(iId);
        return R.setOK("OK", list);
    }
}
