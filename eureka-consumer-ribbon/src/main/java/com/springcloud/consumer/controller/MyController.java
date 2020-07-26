package com.springcloud.consumer.controller;

//import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class MyController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/test")
    public String consumeEurekaClient() {
        return restTemplate.getForObject("http://myeurekaclient/hello", String.class);
    }
}
