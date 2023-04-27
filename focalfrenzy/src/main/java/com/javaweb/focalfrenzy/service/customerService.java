package com.javaweb.focalfrenzy.service;

import com.javaweb.focalfrenzy.entity.Customer;
import com.javaweb.focalfrenzy.repository.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class customerService {
    @Autowired
    private customerRepository repository;
    //  2 post and 2 get requests
    public Customer saveCustomer(Customer customer){
        return repository.save(customer);
    }

    public List<Customer> saveCustomers(List<Customer> customer){
        return repository.saveAll(customer);
    }

    public List<Customer> getCustomers(){
        return repository.findAll();
    }

    public Customer getCustomerById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Customer getCustomerByName(String name) {
        return repository.findByName(name);
    }
    //   delete product
    public String deleteCustomer(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }
    //update product bug
    public Customer updateCustomer(Customer customer) {
        int id = customer.getId();
        Customer existingCustomer = repository.findById(id).orElse(null);
        existingCustomer.setPaymentstatus(customer.getPaymentstatus());

        return repository.save(existingCustomer);
//          return repository.findById(customer.getId());
    }
}
