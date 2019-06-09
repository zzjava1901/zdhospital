package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.entity.SysBianpe;
import com.xiao.zdhospital.service.SysBianpeService;
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
@RequestMapping("/sysBianpe")
public class SysBianpeController {

    @Autowired
    private SysBianpeService bianpeService;

    @ApiOperation(value = "查询便民服务",notes = "这是一个查询便民服务的数据")
    @RequestMapping(value = "find.do",method = RequestMethod.GET)
    public R find(int tid){
        List<SysBianpe> list = bianpeService.find(tid);
        return R.setOK("OK", list);
    }
}
