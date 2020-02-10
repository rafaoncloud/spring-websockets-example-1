package com.websockets.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WebsocketsExample1Application {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketsExample1Application.class, args);
	}

}
