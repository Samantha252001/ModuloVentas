package edu.yavirac.productosbackend.feature.asesor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/asesor")
@CrossOrigin({"*"})
public class AsesorController {


    @Autowired
    AsesorService asesorService;

//CRUD = Crear, Leer, Actualizar, Eliminar
//      Create  Read   Update      Delete

//Crete
    @PostMapping("/save")
    public Asesor save(@RequestBody Asesor asesor){
        return asesorService.save(asesor);
    }

    @GetMapping("/{id}")
    public Asesor findById(@PathVariable long id){
        return asesorService.findById(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Asesor update(@RequestBody Asesor asesor){
        return asesorService.save(asesor);
    }

    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable long id){
        asesorService.deleteById(id);
        
    }
    

    @GetMapping("/findAll")
    public List findAll(){
        return asesorService.findAll();
    }


    @GetMapping("/findByName/{term}")
    public List<Asesor> findByName(@PathVariable String term){
        return asesorService.findByName(term+"%");
    }
        
    
    
}
