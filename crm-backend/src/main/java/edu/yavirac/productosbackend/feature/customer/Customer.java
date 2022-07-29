package edu.yavirac.productosbackend.feature.customer;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("customres")
public class Customer {

    @Id
    private long id;   
    private String name;
    private String identify;
    private String telephone;
    private Date created;
    private Date update;
    private Boolean enable;
    private Long asesorId;

    @MappedCollection(idColumn = "customer_id")
    private Set<CustomerProduct> products = new HashSet<>();
    
}
