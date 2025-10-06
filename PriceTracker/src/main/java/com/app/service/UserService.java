package com.app.service;

import com.app.dto.request.UserRequest;
import com.app.exception.UserException;

public interface UserService {

    String registerUser(UserRequest userRequest)throws UserException;


}
