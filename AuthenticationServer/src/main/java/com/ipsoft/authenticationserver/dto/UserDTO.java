 package com.ipsoft.authenticationserver.dto;

import com.ipsoft.authenticationserver.util.RoleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String userId;
    private String name;
    private String nic;
    private int age;
    private String gender;
    private String email;
    private String password;
    private RoleType roleType;
    private String contactNumber;
    private String address;
    private String  profilePic;
}
