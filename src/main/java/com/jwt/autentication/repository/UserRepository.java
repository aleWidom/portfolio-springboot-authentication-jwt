package com.jwt.autentication.repository;

import java.util.Optional;

import com.jwt.autentication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String username);
}
