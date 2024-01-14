package com.mybank.UserManagement.service;

import com.mybank.UserManagement.DTO.UserDTO;
import com.mybank.UserManagement.User.User;
import com.mybank.UserManagement.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Userservice {

    private final UserRepository userRepository;

    public void creteUser(UserDTO userDTO){
        User user = User.builder().name(userDTO.getName()).email(userDTO.getEmail()).DOB(userDTO.getDOB())
                .phone(userDTO.getPhone()).username(userDTO.getUsername()).password(userDTO.getPassword())
                .build();

        userRepository.save(user);
    }
    public UserDTO finduser(String name){
        User user = userRepository.findByUsername(name);
        return maptoUserDTO(user);
    }

    private UserDTO maptoUserDTO(User user) {
        UserDTO userDTO = UserDTO.builder().name(user.getName())
                .DOB(user.getDOB()).email(user.getEmail()).phone(user.getPhone())
                .username(user.getUsername()).password(user.getPassword()).build();

        return userDTO;
    }
}
