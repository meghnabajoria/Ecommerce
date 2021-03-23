package com.example.ecommerce.service;

import com.example.ecommerce.dto.ProductRequestDto;
import com.example.ecommerce.dto.ProductResponseDto;
import com.example.ecommerce.entity.Product;

import java.util.List;

public interface ProductService {

    Product getProductByProductId(Long productId);
    ProductResponseDto insertDataIntoProducts(ProductRequestDto productRequestDto);

    Product getProductByProductName(String productName);
}
