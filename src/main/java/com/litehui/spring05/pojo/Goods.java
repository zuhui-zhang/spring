package com.litehui.spring05.pojo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Goods {
    @Value("3")
    private int id;
    @Value("asdf")
    private String name;
    @Autowired
    private Category defaultCategory;

    public Goods() {
    }

    public Goods(int id, String name, Category defaultCategory) {
        this.id = id;
        this.name = name;
        this.defaultCategory = defaultCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getDefaultCategory() {
        return defaultCategory;
    }

    public void setDefaultCategory(Category defaultCategory) {
        this.defaultCategory = defaultCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return id == goods.id && Objects.equals(name, goods.name) && Objects.equals(defaultCategory, goods.defaultCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, defaultCategory);
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", defaultCategory=" + defaultCategory +
                '}';
    }

}
