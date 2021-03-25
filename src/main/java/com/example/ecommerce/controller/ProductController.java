package com.example.ecommerce.controller;

import com.example.ecommerce.dto.ProductRequestDto;
import com.example.ecommerce.dto.ProductResponseDto;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author meghna.bajoria
 * @since 23/03/21 4:23 PM
 **/
@CrossOrigin
@RestController("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/insert-product")
    public ProductResponseDto insertProduct(@RequestBody ProductRequestDto productRequestDto) {

        return productService.insertDataIntoProducts(productRequestDto);
    }

    @GetMapping("/getProductByProductId/{productId}")
    public Product getProductByProductId(@PathVariable("productId") Long productId) {

        return productService.getProductByProductId(productId);
    }

    @GetMapping("/getProductByProductName/{productName}")
    public Product getProductByProductName(@PathVariable("productName") String productName) {

        return productService.getProductByProductName(productName);
    }
}
