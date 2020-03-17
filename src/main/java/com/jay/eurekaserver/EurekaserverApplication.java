package com.jay.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//配置为注册中心
@EnableEurekaServer
@SpringBootApplication
//配置 配置中心
@EnableConfigServer
public class EurekaserverApplication {

    public static void main(String[] args) { SpringApplication.run(EurekaserverApplication.class, args);
    }

}
