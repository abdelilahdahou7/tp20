package com.example.voiture;

import com.example.voiture.entity.Voiture;
import com.example.voiture.repository.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class VoitureApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoitureApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(VoitureRepository voitureRepository) {
        return args -> {
            voitureRepository.save(new Voiture("Toyota", "Corolla", 2020, "A-123", 15000.0));
            voitureRepository.save(new Voiture("Honda", "Civic", 2021, "B-456", 18000.0));
            voitureRepository.save(new Voiture("Ford", "Focus", 2019, "C-789", 12000.0));
        };
    }
}
