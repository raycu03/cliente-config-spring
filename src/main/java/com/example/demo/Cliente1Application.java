package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.config.Configuration;


@SpringBootApplication
public class Cliente1Application {

	
	@Autowired
	private Configuration configuratio;
	
	public static void main(String[] args) {
		SpringApplication.run(Cliente1Application.class, args);
	}

}
