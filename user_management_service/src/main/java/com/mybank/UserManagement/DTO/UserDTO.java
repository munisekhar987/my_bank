package com.mybank.UserManagement.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserDTO {
    private String name;
    private String email;
    private String DOB;
    private String phone;
    private String username;
    private String password;
}
