package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
userRepository.save(new User("wafa","Bouchami"));	
userRepository.save(new User("Sarra","Bouchami"));
userRepository.save(new User("Nawel","Ben Chaabene"));	
userRepository.save(new User("mezni","yesmine"));
userRepository.save(new User("fairouz","zorgui"));

}
}
