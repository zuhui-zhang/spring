package com.litehui.spring05.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.*;

@Component
class GoodsTest {
    @Autowired
    Goods goods;

    @Test
    public void createGoods(){
        System.out.println(goods);
    }

}