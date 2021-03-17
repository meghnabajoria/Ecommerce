package com.example.ecommerce.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity(name = "Product")
@Data
public class Product {
    @Id
    @GenericGenerator(name = "product_id_seq" , strategy = "increment")
    @GeneratedValue(generator="product_id_seq",strategy = GenerationType.AUTO)
    private Long productId;
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