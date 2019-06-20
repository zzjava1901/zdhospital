package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.service.SysHistoryService;
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
@RequestMapping("/sysHistory")
public class SysHistoryController {

    @Autowired
    private SysHistoryService historyService;


    @ApiOperation(value = "查询历史背景",notes = "这是一个展示历史背景的数据")
    @RequestMapping(value = "findAll.do",method = RequestMethod.GET)
    public R findAll(int page){
        Map<String, Object> map = historyService.findAll(page);

        return  R.setOK("OK",map);
    }

}
