package com.itcode.course01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //返回json格式数据   Jackson
@RequestMapping("/start")
public class startcontroller {

    @RequestMapping("/springboot")
    public String startspringboot() {
        return "welcome to springboot";
    }
}
