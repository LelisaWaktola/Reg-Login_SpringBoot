// UserService.java
package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    User validateUser(String email, String password);
    boolean userExists(String email);
    void saveUser(User user);
}

