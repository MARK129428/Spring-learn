package com.example.springbootrabbitmq;


import lombok.Data;
import java.io.Serializable;

@Data
public class User implements Serializable {
    public String name;
    public String password;
}