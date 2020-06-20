package com.itcode.course03.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {
    private final static  Logger logger = LoggerFactory.getLogger(Test.class);

    @RequestMapping("/log")
    public String testLog(){
        logger.debug("=====测试日志debug级别打印====={}","dd");
        logger.info("======测试日志info级别打印======");
        logger.error("=====测试日志error级别打印=====");
        logger.warn("======测试日志warn级别打印======");

        //用占位符打印出一些参数信息
        String str1 = "blog.itcode.com";
        String str2 = "blog.csdn.new";
        logger.info("===你好===:{};我也好:{}",str1,str2);  //占位符打印日志

        return  "success";
    }
}
