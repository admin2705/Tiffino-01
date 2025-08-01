package com.tiffino.reviewservice.repo;

import com.tiffino.reviewservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User , Long> {
    Optional<User> findById(Long id);

}
