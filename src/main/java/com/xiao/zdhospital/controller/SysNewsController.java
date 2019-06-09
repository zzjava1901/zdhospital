package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.service.SysNewsService;
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
@RequestMapping("/sysNews")
public class SysNewsController {
    @Autowired
    private SysNewsService newsService;

    @ApiOperation(value="医院新闻",notes = "这是一个医院新闻展示的数据")
    @RequestMapping(value = "findAll.do",method = RequestMethod.GET)
    public R findAll(int page){
        Map<String, Object> map = newsService.findAll(page);

        return R.setOK("OK",map);


    }
}
