package com.itcode.course04.controller;

import com.itcode.course04.service.MicroServiceUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test2")
public class ConfigController {
    private static  final Logger  logger = LoggerFactory.getLogger(ConfigController.class);

    @Value("${url.orderUrl}")   //获取配置文件中url下的orderUrl值
    private  String orderUrl;
    @Resource
    private MicroServiceUrl microServiceUrl;

    /* @GetMapping
       @PutMapping
       @PostMapping
       @DeleteMapping
       对应相应的method方法简写  @GetMapping("/config")
     */
    @RequestMapping(value = "/config", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
    public  String testCnfig(){
        logger.info("====获取的地址为：{}", orderUrl);
        logger.info("====获取的用户地址为：{}", microServiceUrl.getUserUrl());
        return  "success";
    }
}
