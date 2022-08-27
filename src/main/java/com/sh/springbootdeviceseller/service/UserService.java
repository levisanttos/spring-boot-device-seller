package com.sh.springbootdeviceseller.service;

import com.sh.springbootdeviceseller.model.Role;
import com.sh.springbootdeviceseller.model.User;

import java.util.Optional;

public interface UserService {

    User save(User user);

    Optional<User> finByUsername(String username);

    void changeRole(Role role, String username);
}
