package com.tc.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tc.service.GoodsService;

public class GoodsAction {
    private static GoodsService goodsService;

    /**
     * @Title: main 
     * @Description: 模拟spring mvc的 请求 类似于 @Controller
     * @param args
     * @return: void
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        /*//spring 注入
        ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("file:D:/workspace/GZDTL_TRUNK/zdd-web-consumer/spring/applicationContext.xml");
        goodsService = (GoodsService) applicationContext.getBean("getGoodService");
        System.out.println(goodsService.findAllGoodsByParams());*/
        ApplicationContext  dubbo_cusumer = new ClassPathXmlApplicationContext("dubbo-config.xml");
        GoodsService  service = (GoodsService) dubbo_cusumer.getBean("goodsService");
        System.out.println(service.findAllGoodsByParams());
    }
}