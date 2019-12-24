package com.github.mytodolist.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
@Api(tags = "测试接口")
public class Test {

    @RequestMapping("test")
    @ApiOperation(value = "测试接口", notes = "接口描述", httpMethod = "GET")
    @ResponseBody
    public String testApi() {
        return "apireturn";
    }

    @RequestMapping(value = "testPage",method = RequestMethod.GET)
    public String testPage() {
        return "index.html";
    }
}
