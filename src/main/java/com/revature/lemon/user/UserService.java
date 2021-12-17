package com.revature.lemon.user;

import com.revature.lemon.user.dtos.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User login(LoginRequest loginRequest){
//        System.out.println(loginRequest.toString());
        //check if user exists, return null for yes
        if (userRepository.findUserById(loginRequest.getId()).isPresent()){
            System.out.println(loginRequest.toString());
            return null;
        }
        else {//if the database doesn't have this user, save the new user info
            User newUser = new User(loginRequest.getId(),
                    loginRequest.getUsername(),
                    loginRequest.getDiscriminator());
            //TODO: Need a Centralized Exception Handling Module to handle exceptions may raised during data persistence
            userRepository.save(newUser);
            return newUser;
        }
    }
}
