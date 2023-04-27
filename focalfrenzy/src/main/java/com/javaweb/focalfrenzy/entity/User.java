package com.javaweb.focalfrenzy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USERS_TBL")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String password;
    private String mobileno;

}
