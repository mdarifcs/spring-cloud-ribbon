package com.example.ribbon.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.ribbon.config.RibbonConfiguration;

@RestController
@RequestMapping("/ribbon-load-balance")
@RibbonClient(name = "ping-chat", configuration = RibbonConfiguration.class)
public class LoadBalanceResource {

	@Autowired
	public RestTemplate restTemplate;

	@GetMapping("/invoke")
	public String invokeChatbook() {
		return restTemplate.getForObject("http://chat/chatbook-application/chat", String.class);
	}
	
}
