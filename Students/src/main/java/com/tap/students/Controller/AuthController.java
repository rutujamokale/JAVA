package com.tap.students.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tap.students.dto.Credential;
import com.tap.students.security.JwtUtil;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Credential credential) {
        System.out.println("login");
        System.out.println(credential.email + " " + credential.password);
        if (credential.email.equals("tfl@gmail.com") && credential.password.equals("seed")) {
            String token = jwtUtil.generateToken("student", "ADMIN");
            return Map.of("token", token);
        }
        else {
            return Map.of("token", "invalid");
        }

    }
    @GetMapping("/welcome")
    public Map<String, String> welcome() {
        return Map.of("status", "ypu are welcome");
    }

}