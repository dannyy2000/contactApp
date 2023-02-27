package com.evoter.service;

import com.evoter.entity.User;
import com.evoter.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

/**
 * @author showunmioludotun
 */
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }
}
