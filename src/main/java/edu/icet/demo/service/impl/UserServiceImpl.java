package edu.icet.demo.service.impl;

import edu.icet.demo.dto.User;
import edu.icet.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public boolean login(User user){
        return true;
    }
    @Override
    public boolean register(User user){
        return true;
    }
}
