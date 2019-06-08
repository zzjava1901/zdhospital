package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.entity.SysDoctor;
import com.xiao.zdhospital.entity.SysSchool;
import com.xiao.zdhospital.service.SysDoctorService;
import com.xiao.zdhospital.service.SysSchoolService;
import com.xiao.zdhospital.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Api
@RestController
@RequestMapping("/sysSchool")
public class SysSchoolController {
    @Autowired
    SysSchoolService schoolService;

    @ApiOperation(value = "查询所有校园招聘",notes = "这是一个查询所有校园招聘")
    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public R findAll(int page){
        Map<String, Object> map = schoolService.findAll(page);
        return R.setOK("OK",map);
    }






}
