package com.example.ecommerce.service;

import com.example.ecommerce.dto.LoginRequestDto;
import com.example.ecommerce.dto.LoginResponseDto;
import com.example.ecommerce.dto.RegistrationRequestDto;
import com.example.ecommerce.dto.RegistrationResponseDto;

/**
 * @author meghna.bajoria
 * @since 17/03/21 12:10 PM
 **/
public interface RegistrationService {
    RegistrationResponseDto insertDataIntoUser(RegistrationRequestDto registrationRequestDto);
    LoginResponseDto loginUser(LoginRequestDto loginRequestDto);
}
