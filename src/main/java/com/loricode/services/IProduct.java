package com.loricode.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.loricode.models.Product;

@EnableJpaRepositories
@Repository
public interface IProduct extends JpaRepository<Product, Integer> {  }
