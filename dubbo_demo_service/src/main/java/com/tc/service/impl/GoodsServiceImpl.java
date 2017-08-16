package com.tc.service.impl;
import java.util.ArrayList;
import java.util.List;

import com.tc.entity.Goods;
import com.tc.service.GoodsService;

/**
 * 
 * @ClassName: GoodsServiceImpl
 * @Description: 实现类，模拟从数据库查出数据
 * @author: kevin
 * @date: 2016-10-21 上午10:28:36
 */
public class GoodsServiceImpl implements GoodsService {

    public List<Goods> findAllGoodsByParams() {
        List<Goods> glist = new ArrayList<Goods>();
        Goods g = new Goods();
        g.setColor("蓝色");
        g.setId(1);
        g.setName("耐克长袖");
        g.setPrice(268);
        Goods g1 = new Goods();
        g1.setColor("黑色");
        g1.setId(1);
        g1.setName("阿迪达斯板鞋");
        g1.setPrice(499);
        glist.add(g);
        glist.add(g1);
        return glist;
    }

}