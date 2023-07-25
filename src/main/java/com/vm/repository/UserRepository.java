package com.vm.repository;

import com.vm.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Optional<User> findByUserId(Long userId);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
