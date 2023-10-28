package com.ruvindi.aad.user_service.repo;

import com.ruvindi.aad.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

    Boolean existsByUserName(String userName);
    Boolean existsByUserNameAndPassword(String userName,String Password);

    User findByUserNameAndPassword(String userName,String Password);

}
