package com.example.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author meghna.bajoria
 * @since 17/03/21 12:07 PM
 **/
@Getter
@Setter
public class RegistrationRequestDto {
    private String emailId;
    private String firstName;
    private String lastName;
    private String password;
    // private String confirmPassword;
    //private String dob;
}
