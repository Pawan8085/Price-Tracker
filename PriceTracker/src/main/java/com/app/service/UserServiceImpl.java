package com.app.service;

import com.app.dto.request.UserRequest;
import com.app.exception.UserException;
import com.app.model.User;
import com.app.repository.UserRepo;
import com.app.transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepo userRepo;
    private PasswordEncoder passwordEncoder;
    private EmailService emailService;
    @Autowired
    public UserServiceImpl(UserRepo userRepo, PasswordEncoder passwordEncoder, EmailService emailService) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
        this.emailService = emailService;
    }

    @Value("${app.mail}")
    private String mail;

    @Override
    public String registerUser(UserRequest userRequest) {
        // send registration mail
        String subject = "PriceTracker Registraion";
        String text = "You have successfully registered to PriceTracker";
        boolean success = emailService.send(userRequest.getEmail(), mail, subject, text);

        if(success){
            User user = UserTransformer.userRequestToUser(userRequest);
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            return "you have registered successfully";
        }

        throw new UserException("Invalid email id!");

    }
}
