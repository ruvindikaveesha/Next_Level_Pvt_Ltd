package com.ipsoft.authenticationserver.config;

import com.ipsoft.authenticationserver.dto.UserDTO;
import com.ipsoft.authenticationserver.entity.UserCredential;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;


@Component
@CrossOrigin("*")
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${user-server-endpoint}")
    private String  userDataEndpoint;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDTO userDTO = restTemplate.getForObject(userDataEndpoint+username, UserDTO.class);
        System.out.println(userDTO.getName());
        if (userDTO==null)
            throw new RuntimeException("Cannot find user..!!");
        UserCredential userCredential=new UserCredential(userDTO.getUserId(),userDTO.getName(), userDTO.getEmail(),userDTO.getPassword());
        return new CustomUserDetails(userCredential);
    }
}
