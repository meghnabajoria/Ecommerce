package com.example.ecommerce.service.serviceImpl;

import com.example.ecommerce.dto.ProductRequestDto;
import com.example.ecommerce.dto.ProductResponseDto;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.repository.ProductRepository;
import com.example.ecommerce.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductResponseDto insertDataIntoProducts(ProductRequestDto productRequestDto) {
        Product product = new Product();
        BeanUtils.copyProperties(productRequestDto,product);
        Product savedProduct = productRepository.save(product);

        ProductResponseDto productResponseDto = new ProductResponseDto();
        BeanUtils.copyProperties(savedProduct,productResponseDto);
        productResponseDto.setMessage("Product inserted successfully");

        return productResponseDto;
    }

    @Override
    public Product getProductByProductId(Long productId) {
        Product product = productRepository.findByProductId(productId);
        // Product product = new Product();
        // productRepository.findById(productId);
        String name =  product.getProductName();
        if(name!=null)
            return product;
        else
            return null;
    }

    @Override
    public Product getProductByProductName(String productName) {
        Product product = productRepository.findByProductName(productName);
        String name = product.getProductName();
        if(name!=null)
            return product;
        else
        {
//            ProductResponseDto productResponseDto = new ProductResponseDto();
//            productResponseDto.setMessage("Product not found");
            return null;
            // message ?
        }
    }
}
