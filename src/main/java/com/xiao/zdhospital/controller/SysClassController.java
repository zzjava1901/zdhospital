package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.service.SysClassService;
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
@RequestMapping("/sysClass")
public class SysClassController {

    @Autowired
    private SysClassService classService;

    @ApiOperation(value = "健康讲堂",notes = "这是一个健康讲堂展示的数据")
    @RequestMapping(value = "findAll.do",method = RequestMethod.GET)
    public R findAll(int heId,int page){
        Map<String, Object> map = classService.findAll(page,heId);
        return R.setOK("OK",map);
    }


}
