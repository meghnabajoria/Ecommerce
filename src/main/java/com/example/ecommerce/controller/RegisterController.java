package com.example.ecommerce.controller;

import com.example.ecommerce.dto.*;
import com.example.ecommerce.service.ProductService;
import com.example.ecommerce.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author meghna.bajoria
 * @since 17/03/21 12:02 PM
 **/
@CrossOrigin
@RestController
public class RegisterController {

    @Autowired
    private RegistrationService registrationService;
    @Autowired
    private ProductService productService;

    @PostMapping("/register-as-user")
    public RegistrationResponseDto registrationResponseDto(@RequestBody RegistrationRequestDto registrationRequestDto) {
        return registrationService.insertDataIntoUser(registrationRequestDto);
    }

    @PostMapping("login-as-user")
    public LoginResponseDto loginResponseDto(@RequestBody LoginRequestDto loginRequestDto) {

        return registrationService.loginUser(loginRequestDto);
    }

    @PostMapping("insert-product")
    public ProductResponseDto insertProduct(@RequestBody ProductRequestDto productRequestDto) {
        return productService.insertDataIntoProducts(productRequestDto);
    }

    // get- category basis
    // update
    // delete

}
