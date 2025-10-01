package com.example.userservice.controller;

import com.example.userservice.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getAllUsers() {
        return Arrays.asList(
                new User(1L, "Karan", "karan@example.com"),
                new User(2L, "Arjun", "arjun@example.com")
        );
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return new User(id, "Sample User", "sample@example.com");
    }
}