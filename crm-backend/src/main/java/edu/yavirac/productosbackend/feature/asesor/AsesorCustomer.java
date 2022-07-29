package edu.yavirac.productosbackend.feature.asesor;

import org.springframework.data.annotation.Id;

import lombok.Data;
@Data

public class AsesorCustomer {
    @Id
    private long id;
    private Long asesorId;
    private Long customerId;
}
