package com.github.mytodolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class Test {

    @RequestMapping("test")
    public String test() {
        return "index.html";
    }
}
