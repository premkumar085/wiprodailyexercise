package com.wipro.usermgmtv2.entity;

 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users") 
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable=false, unique=true)
    String name;

    @Column(nullable=false, unique=true)
    String email;

    @Column(nullable=false)
    String passWord;

    @Column
    String salt;

    @Column(nullable=false)
    String role; 
}