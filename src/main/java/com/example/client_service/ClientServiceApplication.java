package com.example.client_service;

import com.example.client_service.entities.Client;
import com.example.client_service.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ClientRepository clientRepository) {
		return args -> {
			clientRepository.save(new Client(null, "Rabab", 23F));
			clientRepository.save(new Client(null, "Amal", 22F));
			clientRepository.save(new Client(null, "Samir", 22F));

			clientRepository.findAll().forEach(c ->
				System.out.println("Client ajouté: " + c.getNom())
			);
		};
	}
}
