package com.sh.springbootdeviceseller.service;

import com.sh.springbootdeviceseller.model.Role;
import com.sh.springbootdeviceseller.model.User;
import com.sh.springbootdeviceseller.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User save(User user) {
        user.setPassword(this.passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.ADMIN);
        user.setCreateTime(LocalDateTime.now());
        return this.userRepository.save(user);
    }

    @Override
    public Optional<User> finByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Transactional
    @Override
    public void changeRole(Role role, String username) {
        this.userRepository.updateUserRole(username,role);
    }
}