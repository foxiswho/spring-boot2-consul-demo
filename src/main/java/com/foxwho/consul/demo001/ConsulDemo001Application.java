package com.foxwho.consul.demo001;

import com.foxwho.consul.demo001.model.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties({Config.class})//指定配置类
public class ConsulDemo001Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsulDemo001Application.class, args);
    }
}
