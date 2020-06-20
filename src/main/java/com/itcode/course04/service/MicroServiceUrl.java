package com.itcode.course04.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;



@Component
/*使用 @ConfigurationProperties   (需要导入依赖)
*注解并且使用 prefix 来指定一个前缀，然后该类中的属性名就是配置中去掉前缀后的名字，
*一一对应即可。即：前缀名 + 属性名就是配置文件中定义的 key*/
@ConfigurationProperties(prefix = "url")
public class MicroServiceUrl {
    private  String orderUrl;
    private  String userUrl;
    private  String shopUrl;

    public String getOrderUrl() {
        return orderUrl;
    }

    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public String getShopUrl() {
        return shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }
}
