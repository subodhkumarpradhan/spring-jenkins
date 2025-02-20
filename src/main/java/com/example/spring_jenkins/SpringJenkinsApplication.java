package com.example.spring_jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	@PostConstruct
	public void intt(){
		logger.info("Application started.....");
	}

	public static void main(String[] args) {
		logger.info("Application executed...");
		logger.info("Test case executing second log statement...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
