package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.service.SysActiveService;
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
@RequestMapping("/sysActive")
public class SysActiveController {

    @Autowired
    private SysActiveService activeService;

    @ApiOperation(value="活动院报",notes = "这是一个活动院报展示的数据")
    @RequestMapping(value = "findeAll.do",method = RequestMethod.GET)
    public R findAll(int page){
        Map<String, Object> map = activeService.findAll(page);

        return R.setOK("OK",map);
    }
}
