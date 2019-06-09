package com.xiao.zdhospital.controller;


import com.xiao.zdhospital.service.SysNoticeService;
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
@RequestMapping("/sysNotice")
public class SysNoticeController {

    @Autowired
    private SysNoticeService noticeService;



    @ApiOperation(value="医院公告",notes = "这是一个医院公告展示的数据")
    @RequestMapping(value="findAll.do",method = RequestMethod.GET)
    public R findAll(int page){

        Map<String, Object> map = noticeService.findAll(page);

        return R.setOK("OK",map);
    }

}
