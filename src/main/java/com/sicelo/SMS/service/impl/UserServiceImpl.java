package com.sicelo.SMS.service.impl;

import com.sicelo.SMS.entity.Student;
import com.sicelo.SMS.entity.User;
import com.sicelo.SMS.respository.UserRepository;
import com.sicelo.SMS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User storedPasswordDetails(String password) {
        return userRepository.findByPassword(password);
    }
}
