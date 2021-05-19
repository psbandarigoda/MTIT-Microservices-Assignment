package com.mtit.accountservice.controller;

import com.mtit.accountservice.dto.UserRequest;
import com.mtit.accountservice.dto.UserResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class AccountController {

    @PostMapping(value = "/create", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    UserResponse createUser(@RequestBody UserRequest userRequest) {

        var userResponse = new UserResponse();
        userResponse.setUserId(UUID.randomUUID().toString());
        userResponse.setMessage("Successfully Created User");
        userResponse.setStatus(200);
        return userResponse;
    }

    @GetMapping(value = "/getAll", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    UserResponse getAllUsers(@RequestBody UserRequest userRequest) {

        var userResponse = new UserResponse();
        userResponse.setUserId(UUID.randomUUID().toString());
        userResponse.setMessage("Successfully View All Data");
        userResponse.setStatus(200);
        return userResponse;
    }

}
