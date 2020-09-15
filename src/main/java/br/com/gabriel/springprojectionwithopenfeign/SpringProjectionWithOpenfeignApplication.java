package br.com.gabriel.springprojectionwithopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringProjectionWithOpenfeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectionWithOpenfeignApplication.class, args);
	}

}
