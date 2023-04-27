package com.javaweb.focalfrenzy.controller;
import com.javaweb.focalfrenzy.entity.Customer;
import com.javaweb.focalfrenzy.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class customerController {

    @Autowired
    private customerService service;

    @GetMapping("/")
    public String Home(){
        return "Home page";
    }

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.saveCustomer(customer);
    }

    @PostMapping("/addCustomers")
    public List<Customer> addCustomers(@RequestBody List<Customer> customers) {
        return service.saveCustomers(customers);
    }

    @GetMapping("/customers")
    public List<Customer> findAllCustomers() {
        return service.getCustomers();
    }

    @GetMapping("/customerById/{id}")
    public Customer findCustomerById(@PathVariable int id) {
        return service.getCustomerById(id);
    }
    @GetMapping("/customer/{name}")
    public Customer findProductByName(@PathVariable String name) {
        return service.getCustomerByName(name);
    }

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer) {
        System.out.println(customer.getPaymentstatus());
        return service.updateCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id) {
        return service.deleteCustomer(id);
    }
}
