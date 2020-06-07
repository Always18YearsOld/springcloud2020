package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：ltb
 * @date ：2020/6/6
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    /*自动负载均衡*/
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
