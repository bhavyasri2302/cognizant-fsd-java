package com.cognizant.spring_learn.controller;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public Map<String, String> authenticate() {

        Key key = Keys.hmacShaKeyFor(
                "mysecretkeymysecretkeymysecretkey12".getBytes(StandardCharsets.UTF_8));

       String token = Jwts.builder()
        .setSubject("user")
        .setIssuedAt(new Date())
        .setExpiration(new Date(System.currentTimeMillis() + 600000))
        .signWith(key)
        .compact();

        Map<String, String> response = new HashMap<>();
        response.put("token", token);

        return response;
    }
}