package edu.yavirac.productosbackend.feature.asesor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsesorService {
    
    @Autowired
    AsesorRepository asesorRepository;

    //Create
    public Asesor save(Asesor asesor){
        return asesorRepository.save(asesor);
    }

    //Read
    public Asesor findById(Long id){
        return asesorRepository.findById(id).orElse(new Asesor());
    }

    //Update = Create (PUT)

    //Delete
    public void deleteById(Long id){
        asesorRepository.deleteById(id);
    }

    public List<Asesor> findAll(){
        return asesorRepository.findAll();
    }

    public List<Asesor> findByName(String term){
        return asesorRepository.findByNameLikeIgnoreCase(term);
    }
}
