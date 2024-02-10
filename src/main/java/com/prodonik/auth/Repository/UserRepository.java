package com.prodonik.auth.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodonik.auth.moduls.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail (String email);
}
