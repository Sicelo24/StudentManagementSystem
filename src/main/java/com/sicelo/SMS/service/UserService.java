package com.sicelo.SMS.service;

import com.sicelo.SMS.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User saveUser(User user);

    User storedPasswordDetails(String password);

}
