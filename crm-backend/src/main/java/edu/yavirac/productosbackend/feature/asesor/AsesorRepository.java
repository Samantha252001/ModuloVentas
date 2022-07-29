package edu.yavirac.productosbackend.feature.asesor;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AsesorRepository extends CrudRepository<Asesor, Long>{
    List<Asesor> findAll();

    List<Asesor> findByNameLikeIgnoreCase(String term);
    
}