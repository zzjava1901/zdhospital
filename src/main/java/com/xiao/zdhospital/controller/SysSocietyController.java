package com.xiao.zdhospital.controller;


import com.xiao.zdhospital.service.SysSocietyService;
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
@RequestMapping("/sysSociety")
public class SysSocietyController {
    @Autowired
    private SysSocietyService societyService;

    @ApiOperation(value = "查询所有社会招聘",notes = "这是一个查询所有社会招聘")
    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public R findAll(int page){
        Map<String, Object> map = societyService.findAll(page);
        return R.setOK("OK",map);
    }






}
