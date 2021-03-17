package com.example.ecommerce.entity;

import lombok.Data;
import lombok.Generated;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author meghna.bajoria
 * @since 17/03/21 12:08 PM
 **/
@Entity(name = "Register_User")
@Data
public class User {
    @Id
    @GenericGenerator(name = "user_id_seq" , strategy = "increment")
    @GeneratedValue(generator="user_id_seq",strategy = GenerationType.AUTO)
    private Long UserId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String password;
    //private Date dob;
}
