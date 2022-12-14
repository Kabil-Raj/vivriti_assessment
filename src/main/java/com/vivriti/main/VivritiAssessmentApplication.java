package com.vivriti.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.vivriti.*")
@EntityScan (basePackages = "com.vivriti.model")
@EnableJpaRepositories(basePackages = "com.vivriti.repository")
public class VivritiAssessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(VivritiAssessmentApplication.class, args);
	}

}
