package com.example.ecommerce.entity;

import com.sun.tools.javac.comp.Todo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author meghna.bajoria
 * @since 24/03/21 10:58 PM
 **/

@Getter
@Setter
@ToString
@Document(collection = "Order")
public class Order {

//    @Id
//    @GenericGenerator(name = "order_id_seq" , strategy = "increment")
//    @GeneratedValue(generator="order_id_seq",strategy = GenerationType.AUTO)
//    private long orderId;
//    private long productId;
//    private String productName;
//    private long productQuantity;
//    private long userId;
//    private String firstName;
//    private String lastName;
//    private Date orderDate;
//    private double orderPrice;


    // Todo
    // what about list of orders
}
