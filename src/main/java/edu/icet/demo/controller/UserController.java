package edu.icet.demo.controller;

import edu.icet.demo.dto.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {

    @PostMapping("/auth/login")
    public boolean login(@RequestBody User user){
        return true;
    }
   @PostMapping("/auth/reg")
    public boolean register(@RequestBody User usre){
       return true;
   }
}