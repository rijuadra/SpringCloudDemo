package com.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.springcloud.consumer"})
//
//@EnableEurekaClient
public class EurekaclientconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientconsumerApplication.class, args);
	}

}

