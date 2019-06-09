package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.service.SysDangService;
import com.xiao.zdhospital.service.SysTuanService;
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
@RequestMapping("/sysTuan")

public class SysTuanController {

    @Autowired
    private SysTuanService tuanService;

    @ApiOperation(value = "团建活动",notes = "这是一个团建活动展示的数据")
    @RequestMapping(value = "findAll.do",method = RequestMethod.GET)
    public R findAll(int page){
        Map<String, Object> map = tuanService.findAll(page);
        return R.setOK("OK",map);
    }

}
