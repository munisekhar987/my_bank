package com.mybank.UserManagement.controller;

import com.mybank.UserManagement.DTO.UserDTO;
import com.mybank.UserManagement.service.Userservice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/bank/user")
@RequiredArgsConstructor
public class UserController {
    private final Userservice userservice;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createuser(@RequestBody UserDTO userDTO){
        userservice.creteUser(userDTO);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public UserDTO finduser(@PathVariable String username){
        UserDTO userDTO = userservice.finduser(username);
        return userDTO;
    }
}
