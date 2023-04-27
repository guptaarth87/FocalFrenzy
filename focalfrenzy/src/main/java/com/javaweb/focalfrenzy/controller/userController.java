package com.javaweb.focalfrenzy.controller;
import com.javaweb.focalfrenzy.entity.Customer;
import com.javaweb.focalfrenzy.entity.User;
import com.javaweb.focalfrenzy.service.customerService;
import com.javaweb.focalfrenzy.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class userController {

    @Autowired
    private userService service;

//    @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "Requestor-Type", exposedHeaders = "X-Get-Header")


    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return service.saveUser(user);
    }


    @GetMapping("/users")
    public List<User> findAllUsers() {
        return service.getUsers();
    }

    @GetMapping("/user/{email}")
    public User findUseByEmail(@PathVariable String email) {
        return service.getUserByEmail(email);
    }
}
