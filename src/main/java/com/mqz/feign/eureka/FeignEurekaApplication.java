package com.mqz.feign.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * 服务注册中心
 * @author huluwa
 */
@SpringBootApplication
@EnableEurekaServer
public class FeignEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignEurekaApplication.class, args);
    }

}
