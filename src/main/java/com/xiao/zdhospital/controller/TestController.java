package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api
@RequestMapping("/sysTitle")
@RestController
public class TestController {

    @CrossOrigin
    @ApiOperation(value = "菜单展示",notes = "这是一个菜单展示")
    @RequestMapping(value = "menu.do", method = RequestMethod.GET)
    public R showMenu(){



        return R.setOK("OK",12);
    }


}
