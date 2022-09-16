package com.medeiros;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.medeiros.model.Course;
import com.medeiros.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository){
		return args -> {
			
			Course c = new Course();
			c.setName("Guilherme");
			c.setCategory("back-end");
			courseRepository.save(c);

			Course d = new Course();
			d.setName("Medeiros");
			d.setCategory("front-end");
			courseRepository.save(d);
		}; 
	}

}
