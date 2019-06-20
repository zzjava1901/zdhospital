package com.xiao.zdhospital.controller;

import com.xiao.zdhospital.service.SysFocusService;
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
@RequestMapping("/sysFocus")
public class SysFocusController {
    @Autowired
    private SysFocusService focusService;

    @ApiOperation(value = "媒体聚焦" ,notes = "这是一个媒体聚焦展示的数据")
    @RequestMapping(value = "findAll.do",method = RequestMethod.GET)
    public R findAll(int page){
        Map<String, Object> map = focusService.findAll(page);

        return R.setOK("OK",map);
    }
}
