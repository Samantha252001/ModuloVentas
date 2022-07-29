package edu.yavirac.productosbackend.feature.customer;

import org.springframework.data.annotation.Id;

import lombok.Data;
@Data
public class CustomerProduct {
    @Id
    private long id;
    private Long customerId;
    private Long productId;
    
}
