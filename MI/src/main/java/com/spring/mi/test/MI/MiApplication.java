package com.spring.mi.test.MI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@ComponentScan({"com.spring.mi.test.*"})
@EntityScan("com.spring.mi.test.*")
public class MiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiApplication.class, args);
	}

}
