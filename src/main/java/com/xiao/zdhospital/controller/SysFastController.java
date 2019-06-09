package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.entity.SysFast;
import com.xiao.zdhospital.service.SysFastService;
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
@RequestMapping("/sysFast")
public class SysFastController {

    @Autowired
    private SysFastService fastService;

    @ApiOperation(value = "查询急诊科",notes = "这是一个查询急诊科的数据")
    @RequestMapping(value = "find.do",method = RequestMethod.GET)
    public R find(int iId){
        List<SysFast> list = fastService.find(iId);
        return R.setOK("OK", list);
    }
}
