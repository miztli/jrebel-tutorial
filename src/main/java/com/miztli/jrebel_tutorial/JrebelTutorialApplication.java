package com.miztli.jrebel_tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.miztli")
public class JrebelTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(JrebelTutorialApplication.class, args);
	}

}
