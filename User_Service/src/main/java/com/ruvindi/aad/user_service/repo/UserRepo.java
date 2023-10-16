package com.ruvindi.aad.user_service.repo;

import com.ruvindi.aad.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

}
