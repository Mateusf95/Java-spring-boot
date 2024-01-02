package com.example.springboot.dto;

import com.example.springboot.models.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
