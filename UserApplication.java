package com.UserInterface.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class UserApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
//	@Autowired

	private final UserInterface user;
	 UserApplication(UserInterface user){
		 this.user = user;
	 }
	@Override
	public void run(String... args) throws Exception {
		user.saveto("Sreekar malla");
	}
}
