package edu.icet.demo.controller;

import edu.icet.demo.dto.User;
import edu.icet.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class UserController {

    final UserService userService;
    @PostMapping("/auth/login")
    public boolean login(@RequestBody User user){
        return userService.login(user);
    }
   @PostMapping("/auth/reg")
    public boolean register(@RequestBody User usre){
       return userService.register(usre);
   }
}