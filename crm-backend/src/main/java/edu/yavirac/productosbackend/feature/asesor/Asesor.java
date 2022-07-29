package edu.yavirac.productosbackend.feature.asesor;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("asesors")
public class Asesor {

    @Id
    private long id;   
    private String name;
    private String identify;
    private String mail;
    private String telephone;
    private Date created;
    private Date update;
    private Boolean enable;
    private Long personId;

    @MappedCollection(idColumn = "asesor_id")
    private Set<AsesorCustomer> customers = new HashSet<>();
    
}

