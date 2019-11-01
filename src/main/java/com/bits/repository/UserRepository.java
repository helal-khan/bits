package com.bits.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bits.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
//	Optional<User> findUserByUsername(String username);
	User findByUsername(String username);
}
