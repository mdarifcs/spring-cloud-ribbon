package com.example.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.example.ribbon.config.RibbonConfiguration;

@SpringBootApplication
public class RibbonLoadBalanceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonLoadBalanceAppApplication.class, args);
	}

}
