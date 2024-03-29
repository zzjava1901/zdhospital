package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.service.SysLeaderService;
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
@RequestMapping("/sysLeader")
public class SysLeaderController {

    @Autowired
    private SysLeaderService leaderService;

    @ApiOperation(value = "查询所有领导团队",notes = "这是一个查询所有领导团队的数据")
    @RequestMapping(value = "findAll.do",method = RequestMethod.GET)
    public R findAll(int page){
        Map<String, Object> map = leaderService.findAll(page);
        return R.setOK("OK",map);
    }

}
