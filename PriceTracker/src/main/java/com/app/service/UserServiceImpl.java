package com.app.service;


import com.app.dto.request.UserRequest;
import com.app.model.User;
import com.app.repository.UserRepo;
import com.app.transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserServiceImpl implements UserService {

    private UserRepo userRepo;
    private PasswordEncoder passwordEncoder;
    @Autowired
    public UserServiceImpl(UserRepo userRepo, PasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public String registerUser(UserRequest userRequest) {

        User user = UserTransformer.userRequestToUser(userRequest);
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return "you have registered successfully";
    }
}
