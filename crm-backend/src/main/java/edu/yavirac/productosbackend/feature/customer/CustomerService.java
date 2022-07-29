package edu.yavirac.productosbackend.feature.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    
    @Autowired
    CustomerRepository customerRepository;

    //Create
    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

    //Read
    public Customer findById(Long id){
        return customerRepository.findById(id).orElse(new Customer());
    }

    //Update = Create (PUT)

    //Delete
    public void deleteById(Long id){
        customerRepository.deleteById(id);
    }

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public List<Customer> findByName(String term){
        return customerRepository.findByNameLikeIgnoreCase(term);
    }
}
