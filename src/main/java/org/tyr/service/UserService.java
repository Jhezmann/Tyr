package org.tyr.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.tyr.entity.User;

@Service
public class UserService {
    @Cacheable(value = "users", key = "#userId")
    public User getUserById(int userId) {
        // Method implementation
        return null;
    }

    @CachePut(value = "users", key = "#user.id")
    public User updateUser(User user) {
        // Method implementation
        return user;
    }

    @CacheEvict(value = "users", key = "#userId")
    public void deleteUser(int userId) {
        // Method implementation
    }
}
