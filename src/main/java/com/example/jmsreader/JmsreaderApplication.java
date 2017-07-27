package com.example.jmsreader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = JmxAutoConfiguration.class)
@EnableJms
public class JmsreaderApplication {
	public static void main(String[] args) {
		SpringApplication.run(JmsreaderApplication.class, args);
	}
}
