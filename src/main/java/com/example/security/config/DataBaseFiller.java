package com.example.security.config;

import com.example.security.model.Role;
import com.example.security.repository.UserRepository;
import com.example.security.model.User;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataBaseFiller {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @PostConstruct
    public void init() {
        userRepository.save(User.builder()
                .login("admin")
                .password(passwordEncoder.encode("12345"))
                .role(Role.ADMIN)
                .build());

        userRepository.save(User.builder()
                .login("user")
                .password(passwordEncoder.encode("12345"))
                .role(Role.USER)
                .build());
        userRepository.findAll().forEach(System.out::println);
    }
}
