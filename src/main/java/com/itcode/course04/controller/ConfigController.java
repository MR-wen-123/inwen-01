package com.itcode.course04.controller;

import com.itcode.course04.entity.User;
import com.itcode.course04.service.MicroServiceUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
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
    //@RequestMapping(value = "/config", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
    @PostMapping("/config")
    //public  String testCnfig(@RequestParam(value = "idd", required = false, defaultValue = "007") Long id){
    /*
      *@ReauestBody 接受传过来的json实体数据，用实体类来接受
     */
    public  String testCnfig(@RequestBody User user){
        logger.info("====获取的地址为：{}", orderUrl);
        logger.info("====获取的用户地址为：{}", microServiceUrl.getUserUrl());
        return  "URL传过来的用户："+user.getName();
    }
}
