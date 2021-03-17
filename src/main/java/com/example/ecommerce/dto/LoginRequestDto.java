package com.example.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author meghna.bajoria
 * @since 17/03/21 12:44 PM
 **/
@Getter
@Setter
public class LoginRequestDto {
    private String emailId;
    private String password;
}
