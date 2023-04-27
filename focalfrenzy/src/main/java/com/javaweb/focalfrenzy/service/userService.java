package com.javaweb.focalfrenzy.service;
import com.javaweb.focalfrenzy.entity.Customer;
import com.javaweb.focalfrenzy.entity.User;
import com.javaweb.focalfrenzy.repository.customerRepository;
import com.javaweb.focalfrenzy.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

    @Autowired
    private userRepository repository;

    public User saveUser(User user){
        return repository.save(user);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User getUserByEmail(String email) {
        return repository.findByEmail(email);
    }

}
