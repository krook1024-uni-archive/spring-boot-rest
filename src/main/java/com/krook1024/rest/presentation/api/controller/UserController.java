package com.krook1024.rest.presentation.api.controller;

import com.krook1024.rest.domain.User;
import com.krook1024.rest.repository.UserRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user")
    public List<User> getAllUsers() {
        return userRepository.findAll()
            .stream()
            .map(this::hidePassword)
            .collect(Collectors.toList());
    }

    private User hidePassword(User user) {
        return User.builder()
            .name(user.getName())
            .createdAt(user.getCreatedAt())
            .isAdmin(user.getIsAdmin())
            .build();
    }
}
