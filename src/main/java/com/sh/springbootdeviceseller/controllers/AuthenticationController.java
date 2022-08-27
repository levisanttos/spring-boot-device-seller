package com.sh.springbootdeviceseller.controllers;

import com.sh.springbootdeviceseller.model.User;
import com.sh.springbootdeviceseller.service.AuthenticationService;
import com.sh.springbootdeviceseller.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/authentication/")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private UserService userService;

    @PostMapping("sign-up")
    public ResponseEntity signUp(@RequestBody User user) {

        if (userService.finByUsername(user.getUsername()).isPresent()) {
            return new ResponseEntity(HttpStatus.CONFLICT);
        }

        return new ResponseEntity(this.userService.save(user), HttpStatus.CREATED);
    }

    @PostMapping("sign-in")
    public ResponseEntity sigIn(@RequestBody User user) {

        return new ResponseEntity(this.authenticationService.sigInAndReturnJWT(user), HttpStatus.OK);
    }
}
