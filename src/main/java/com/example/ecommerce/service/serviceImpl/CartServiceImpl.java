package com.example.ecommerce.service.serviceImpl;

import com.example.ecommerce.dto.CartRequestDto;
import com.example.ecommerce.dto.CartResponseDto;
import com.example.ecommerce.entity.Cart;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.repository.CartRepository;
import com.example.ecommerce.service.CartService;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author meghna.bajoria
 * @since 25/03/21 12:26 AM
 **/
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    public CartRepository cartRepository;

    public CartResponseDto addToCart(CartRequestDto cartRequestDto) {
        Cart cart = new Cart();
//        BeanUtils.copyProperties(cartRequestDto, cart);
//        Cart savedCart = cartRepository.save(cart);
//        CartResponseDto cartResponseDto = new CartResponseDto();
//        BeanUtils.copyProperties(savedCart,cartResponseDto);
//        cartResponseDto.setMessage("Added to Cart");

        List<Product> productList = new ArrayList<>();
        cart.setProducts(productList);
        cart.setTotalAmount(cart.getTotalAmount());
        cartRepository.save(cart);
        CartResponseDto cartResponseDto = new CartResponseDto();
        cartResponseDto.setMessage("Added to cart");

        return cartResponseDto;

    }
}
