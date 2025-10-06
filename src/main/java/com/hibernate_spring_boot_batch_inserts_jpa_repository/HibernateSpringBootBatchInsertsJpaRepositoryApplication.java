package com.hibernate_spring_boot_batch_inserts_jpa_repository;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hibernate_spring_boot_batch_inserts_jpa_repository.service.BookstoreService;

@SpringBootApplication
public class HibernateSpringBootBatchInsertsJpaRepositoryApplication {

	private final BookstoreService bookstoreService;

    public HibernateSpringBootBatchInsertsJpaRepositoryApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }
    
	public static void main(String[] args) {
		SpringApplication.run(HibernateSpringBootBatchInsertsJpaRepositoryApplication.class, args);
	}

	@Bean
	public ApplicationRunner init() {
		return args -> {
			bookstoreService.batchAuthors();
		};
	}
	
}
