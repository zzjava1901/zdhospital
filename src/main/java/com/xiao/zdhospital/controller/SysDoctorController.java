package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.entity.SysDoctor;
import com.xiao.zdhospital.service.SysDoctorService;
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
@RequestMapping("/sysDoctor")
public class SysDoctorController {
    @Autowired
    SysDoctorService doctorService;

    @ApiOperation(value = "查询所有医生",notes = "这是一个查询所有医生的展示")
    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public R findAll(){
        List<SysDoctor> list = doctorService.findAll();
        return R.setOK("OK",list);
    }

    @ApiOperation(value = "根据具体科查询医生",notes = "这是一个根据具体科查询医生的展示")
    @RequestMapping(value = "findByIid",method = RequestMethod.GET)
    public R findByIid(int iId){
        List<SysDoctor> list = doctorService.findByIid(iId);

        return R.setOK("OK",list);
    }




}
