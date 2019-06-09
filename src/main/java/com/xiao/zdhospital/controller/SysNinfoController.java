package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.service.SysNinfoService;
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
@RequestMapping("/sysNinfo")

public class SysNinfoController {

    @Autowired
    private SysNinfoService ninfoService;

    @ApiOperation(value = "查询所有护理天地",notes = "这是一个查询所有护理天地信息")
    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public R findAll(int page){
        Map<String, Object> map = ninfoService.findAll(page);
        return R.setOK("OK",map);
    }






}
