package com.example.ecommerce.service;

import com.example.ecommerce.dto.CartRequestDto;
import com.example.ecommerce.dto.CartResponseDto;

/**
 * @author meghna.bajoria
 * @since 25/03/21 12:27 AM
 **/
public interface CartService {
    CartResponseDto addToCart(CartRequestDto cartRequestDto);
}
