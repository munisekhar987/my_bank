package com.mybank.UserManagement.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;

@Data
@Document(collection = "users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id

    private String Id;
    private String name;
    private String email;
    private String DOB;
    private String phone;
    private String username;
    private String password; //hashed password
    private String usertype;
}
