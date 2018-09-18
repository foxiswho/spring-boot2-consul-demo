package com.foxwho.consul.demo001.controller;

import com.foxwho.consul.demo001.model.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private Config config;

    @RequestMapping(value = "/getConfig")
    public String getConfig() {
        return config.toString();
    }

    @RequestMapping(value = "/getTitle")
    public String getTitle() {
        return config.getTitle();
    }
}
