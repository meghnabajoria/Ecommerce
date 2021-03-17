package com.example.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductRequestDto {
//    private Long productId;
    private String productName;
    private String productDescription;
    private List<String> Images;
    private String category;
    private String brand;
    private int MRP;
    private int discount;
    private boolean isInStock;
    private String warranty;


}
