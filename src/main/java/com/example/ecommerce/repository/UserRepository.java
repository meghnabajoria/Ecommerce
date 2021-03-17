package com.example.ecommerce.repository;

import com.example.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author meghna.bajoria
 * @since 17/03/21 12:09 PM
 **/
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "Select user_id from register_user r where r.email_id = ?1 ", nativeQuery = true)
    public Long findByEmailId(String emailId);
}



