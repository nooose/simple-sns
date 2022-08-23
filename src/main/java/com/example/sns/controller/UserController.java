package com.example.sns.controller;

import com.example.sns.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
@RestController
public class UserController {

    private final UserService userService;

    // TODO : implement
    @PostMapping
    public void join() {
        userService.join("", "");
    }

    // TODO : implement
    @PostMapping
    public String login() {
        return "";
    }
}
