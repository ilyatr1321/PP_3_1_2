package com.dao;


import com.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User user, int id);

    User getUserById(int id);

    void deleteUser(int id);

}