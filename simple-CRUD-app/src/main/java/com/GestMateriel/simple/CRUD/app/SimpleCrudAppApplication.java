package com.GestMateriel.simple.CRUD.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.GestMateriel.simple.CRUD.app.model")           // ← dit à JPA où chercher les @Entity
@EnableJpaRepositories("com.GestMateriel.simple.CRUD.app.repository") // ← dit à Spring où cherchez les @Repository
public class SimpleCrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleCrudAppApplication.class, args);
	}

}
