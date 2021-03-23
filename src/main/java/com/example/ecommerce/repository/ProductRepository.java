package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

@EnableJpaRepositories
public interface ProductRepository extends MongoRepository<Product, Long> {

    @Query(value = "{_id : ?0}")
    Product findByProductId(Long postId);

    @Query(value = "{productName : ?0}")
    Product findByProductName(String productName);
}
