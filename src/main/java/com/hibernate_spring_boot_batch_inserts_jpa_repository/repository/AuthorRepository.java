package com.hibernate_spring_boot_batch_inserts_jpa_repository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate_spring_boot_batch_inserts_jpa_repository.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {        
}