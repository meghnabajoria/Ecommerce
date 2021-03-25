package com.example.ecommerce.controller;

import com.example.ecommerce.dto.CartRequestDto;
import com.example.ecommerce.dto.CartResponseDto;
import com.example.ecommerce.entity.Cart;
import com.example.ecommerce.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author meghna.bajoria
 * @since 25/03/21 12:14 AM
 **/
@CrossOrigin
@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/addToCart")
    public CartResponseDto addToCart(@RequestBody CartRequestDto cartRequestDto) {
        return cartService.addToCart(cartRequestDto);
    }
}
