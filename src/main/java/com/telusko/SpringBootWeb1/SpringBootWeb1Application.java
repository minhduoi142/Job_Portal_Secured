package com.telusko.SpringBootWeb1;

import com.telusko.SpringBootWeb1.model.Users;
import com.telusko.SpringBootWeb1.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootWeb1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootWeb1Application.class, args);
		UsersRepository repository = context.getBean(UsersRepository.class);
		Users users1 = context.getBean(Users.class);
		users1.setId(2);
		users1.setUsername("Mina");
		users1.setPassword("@123");
		repository.save(users1);
	}
}
