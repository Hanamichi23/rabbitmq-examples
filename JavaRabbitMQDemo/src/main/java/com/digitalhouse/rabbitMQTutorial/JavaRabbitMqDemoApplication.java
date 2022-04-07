package com.digitalhouse.rabbitMQTutorial;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class JavaRabbitMqDemoApplication {

	static Logger logger = LoggerFactory.getLogger(JavaRabbitMqDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JavaRabbitMqDemoApplication.class, args);
	}

}
