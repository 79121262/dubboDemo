package com.tc.controller;

import com.tc.entity.Goods;
import com.tc.service.GoodsService;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")  
public class GoodsController implements InitializingBean{
    @Autowired
    private GoodsService goodsService;
    @RequestMapping("/hello.do")
    @ResponseBody
    public String sayHello() {
    	List<Goods> g=goodsService.findAllGoodsByParams();
    	for (Goods goods : g) {
			System.out.println(goods);
		}
        return "";
    }
    
    @RequestMapping("/hello1.do")
    @ResponseBody
    public String sayHello1() {
    	System.out.println("hello world");
        return "hello world";
    }

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("---------初始化--------");
		
	}
}
