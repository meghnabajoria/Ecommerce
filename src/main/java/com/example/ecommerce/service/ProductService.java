package com.example.ecommerce.service;

import com.example.ecommerce.dto.ProductRequestDto;
import com.example.ecommerce.dto.ProductResponseDto;

public interface ProductService {
    ProductResponseDto insertDataIntoProducts(ProductRequestDto productRequestDto);
}
