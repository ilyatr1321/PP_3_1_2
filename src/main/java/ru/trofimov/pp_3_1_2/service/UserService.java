package com.service;


import com.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User user, int id);

    User getUserById(int id);

    void deleteUser(int id);

    User getUser(int id);
}