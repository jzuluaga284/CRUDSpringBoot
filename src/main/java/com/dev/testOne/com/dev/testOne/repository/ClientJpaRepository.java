package com.dev.testOne.com.dev.testOne.repository;

import com.dev.testOne.com.dev.testOne.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientJpaRepository extends JpaRepository<Client,Integer> {
}
