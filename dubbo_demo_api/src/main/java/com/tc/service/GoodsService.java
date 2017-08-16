package com.tc.service;
import java.util.List;

import com.tc.entity.Goods;

public interface GoodsService {

    List<Goods> findAllGoodsByParams();
}