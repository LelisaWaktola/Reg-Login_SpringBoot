// UserServiceImpl.java
package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // This makes it injectable with @Autowired
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User validateUser(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public boolean userExists(String email) {
        return userRepository.findByEmail(email) != null;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
