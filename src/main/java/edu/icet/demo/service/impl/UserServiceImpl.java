package edu.icet.demo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demo.dto.User;
import edu.icet.demo.entity.UserEntity;
import edu.icet.demo.repository.UserRepository;
import edu.icet.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepository repository;
    @Override
    public boolean login(User user){
        repository.save(new ObjectMapper().convertValue(user, UserEntity.class));
        return false;
    }
    @Override
    public boolean register(User user){
        return true;
    }
}
