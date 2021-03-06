package com.example.springbootdem.dao;


import com.example.springbootdem.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    void update(User updatedUser);

    User getUserById(Integer id);

    void delete(Integer id);

    List<User> getDemandedUsers();

    User findByUsername(String username);
}
