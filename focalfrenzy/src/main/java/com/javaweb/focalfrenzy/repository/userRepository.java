package com.javaweb.focalfrenzy.repository;
import com.javaweb.focalfrenzy.entity.Customer;
import com.javaweb.focalfrenzy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface userRepository extends JpaRepository <User,Integer>{
    User findByEmail(String email);
}
