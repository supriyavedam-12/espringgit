package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyFirstApp3Application {
	@RequestMapping
	public String App1()
	{
		return "Hiiiiiii";
	}

	

	public static void main(String[] args) {
		SpringApplication.run(MyFirstApp3Application.class, args);
	}

}
