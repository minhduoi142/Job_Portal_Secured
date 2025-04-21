package com.telusko.SpringBootWeb1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Data
@Component
@Table(name = "users")
public class Users {
@Id
    private int id;
    private String username;
    private String password;

}
