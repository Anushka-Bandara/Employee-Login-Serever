package edu.icet.demo.dto;

import lombok.Data;

@Data
public class User {
    private String userName;
    private String email;
    private String password;
    private String role;
}
