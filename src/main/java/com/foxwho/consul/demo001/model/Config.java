package com.foxwho.consul.demo001.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

//title要与consul上面的config:下 title写的一样，consul上面可以写多级目录 例如： config： title: 这是标题
//对应bootstrap.yml 中的 config
@ConfigurationProperties(prefix = "config")
public class Config {
    private String title; //name要与consul上面的title写的一样

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "title : ["+title+"] ";
    }
}
