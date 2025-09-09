package com.wipro.usermgmtv2.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(nullable=false)
    private String firstName;

    @Column(nullable=false)
    private String lastName;

    @Column(unique = true, nullable=false)
    private String emailId;

    @Column(nullable=false)
    private String userId;

    @Column(nullable=false)
    private String passWord; 

    private String address;

    private int userType;

    private boolean isLoggedIn;

    @Column
    private String salt;
}
