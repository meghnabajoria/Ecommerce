package com.example.ecommerce.dto;

import com.example.ecommerce.entity.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author meghna.bajoria
 * @since 25/03/21 12:16 AM
 **/
@Getter
@Setter
public class CartRequestDto {

    private List<Product> products;
    private double totalAmount;
}
