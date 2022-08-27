package com.sh.springbootdeviceseller.service;

import com.sh.springbootdeviceseller.model.User;

public interface AuthenticationService {
    User sigInAndReturnJWT(User sigInRequest);
}
