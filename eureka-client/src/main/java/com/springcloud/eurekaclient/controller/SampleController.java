package com.springcloud.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/hello")
    public String getResponse(){
        return "Hi Saikat! you are getting Response from eureka client";
    }
}
