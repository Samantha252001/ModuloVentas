package edu.yavirac.productosbackend.feature.customer;

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
@RequestMapping("/api/customer")
@CrossOrigin({"*"})
public class CustomerController {


    @Autowired
    CustomerService customerService;

//CRUD = Crear, Leer, Actualizar, Eliminar
//      Create  Read   Update      Delete

//Crete
    @PostMapping("/save")
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable long id){
        return customerService.findById(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer update(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable long id){
        customerService.deleteById(id);
        
    }
    

    @GetMapping("/findAll")
    public List findAll(){
        return customerService.findAll();
    }


    @GetMapping("/findByName/{term}")
    public List<Customer> findByName(@PathVariable String term){
        return customerService.findByName(term+"%");
    }
        
    
    
}
