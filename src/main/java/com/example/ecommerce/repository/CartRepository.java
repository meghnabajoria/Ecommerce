package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Cart;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author meghna.bajoria
 * @since 25/03/21 10:22 AM
 **/
@EnableJpaRepositories
public interface CartRepository extends MongoRepository<Cart,Long> {

}
