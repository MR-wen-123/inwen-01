package com.itcode.course02.controller;

import com.itcode.course02.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/json")
public class Controller {

    @RequestMapping("/user")
    public User getUser(){
        return new User(1,"冷风机","123456");
    }

    @RequestMapping("/list")
    public List<User> getUserList(){
        List<User> userList = new ArrayList<>();
        User user1 = new User(1,"冷风机","123456");
        User user2 = new User(2,"大开口","123456");
        userList.add(user1);
        userList.add(user2);
        return  userList;
    }

    @RequestMapping("/map")    //map中不管是什么数据类型都可以转成相应的json格式
    public Map<String,Object> getMap(){
        Map<String,Object> map = new HashMap<>(3);
        User user = new User(1,"冷风机","123456");
        map.put("作者信息",user);
        map.put("博客地址","http://blog.itcodai.com");
        map.put("CSDN地址","http://blog.csdn.net/eson_15");
        map.put("人生哲学",null);
        map.put("粉丝数量",4245);
        return  map;
    }

}
