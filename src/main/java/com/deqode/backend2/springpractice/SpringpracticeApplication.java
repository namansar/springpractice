package com.deqode.backend2.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.deqode.backend2.springpractice.repository")
public class SpringpracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringpracticeApplication.class, args);
	}

}
