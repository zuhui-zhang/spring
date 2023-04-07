package com.litehui.spring05.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("defaultCategory")
public class Category {
    @Value("1")
    private int id;

    @Value("qwer")
    private String name;
}
