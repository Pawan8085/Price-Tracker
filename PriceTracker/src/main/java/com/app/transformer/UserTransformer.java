package com.app.transformer;

import com.app.dto.request.UserRequest;
import com.app.model.User;

public class UserTransformer {


    public static User userRequestToUser(UserRequest userRequest){
        // UserRequest to User
        return User.builder()
                .name(userRequest.getName())
                .email(userRequest.getEmail())
                .password(userRequest.getPassword())
                .build();

    }
}
