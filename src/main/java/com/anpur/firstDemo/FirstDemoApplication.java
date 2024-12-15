package com.anpur.firstDemo;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableReactiveMongoRepositories
public class FirstDemoApplication {

	private static final Logger log = LoggerFactory.getLogger(FirstDemoApplication.class);

	public static void main(String[] args) {
		log.info("Hello Spring boot");
		SpringApplication.run(FirstDemoApplication.class, args);
	}

}
