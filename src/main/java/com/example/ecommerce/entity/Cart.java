package com.example.ecommerce.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * @author meghna.bajoria
 * @since 25/03/21 12:21 AM
 **/
@Data
@ToString
@Document(collection = "Cart")
public class Cart {

    @Id
    @GenericGenerator(name = "order_id_seq" , strategy = "increment")
    @GeneratedValue(generator="order_id_seq",strategy = GenerationType.AUTO)
    private long cartId;
    private long userId;
    private List<Product> products;
    private double totalAmount;
}
