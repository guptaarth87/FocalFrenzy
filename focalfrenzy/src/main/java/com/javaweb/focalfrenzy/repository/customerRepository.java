package com.javaweb.focalfrenzy.repository;

import com.javaweb.focalfrenzy.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface customerRepository extends JpaRepository <Customer,Integer>{
    Customer findByName(String name);
}
