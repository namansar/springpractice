package com.deqode.backend2.springpractice;

import com.deqode.backend2.springpractice.entity.User;
import com.deqode.backend2.springpractice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@EnableMongoRepositories("com.deqode.backend2.springpractice.repository")
public class SpringpracticeApplication {

	@Autowired
	UserRepository userRepository;

	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(
				new User("user1@gmail.com", "ankita", "ankita123"),
				new User("user2@gmail.com", "naman", "naman123"),
				new User("user3@gmail.com", "mahesh", "mahesh123"),
				new User("user4@gmail.com", "deqode", "deqode123")).collect(Collectors.toList());
		userRepository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringpracticeApplication.class, args);
	}

}
