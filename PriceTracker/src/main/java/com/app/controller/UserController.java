package com.app.controller;

import com.app.dto.request.UserRequest;
import com.app.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUserHandler(@RequestBody @Valid UserRequest userRequest){
        String msg = userService.registerUser(userRequest);
        return new ResponseEntity<String>(msg, HttpStatus.CREATED);
    }


    @GetMapping("/profile")
    public String profile(Authentication auth){

        return "Hi "+auth.getName();
    }

}
