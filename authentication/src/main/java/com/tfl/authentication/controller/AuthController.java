package com.tfl.authentication.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfl.authentication.dto.LoginCredentials;
import com.tfl.authentication.util.JWTUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final JWTUtil jwtUtil;

    public AuthController(JWTUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody LoginCredentials credentials) {
        String name = credentials.getUsername();
        String role = credentials.getRole();

        System.out.println("username:" + name + "role:" + role);

        String token = jwtUtil.generateToken(credentials.getUsername(), credentials.getRole());
        return Map.of("token ", token);
    }

}
