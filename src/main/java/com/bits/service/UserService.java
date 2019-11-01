package com.bits.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bits.model.Role;
import com.bits.model.User;
import com.bits.repository.RoleRepository;
import com.bits.repository.UserRepository;


@Service("userService")
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
    private RoleRepository roleRepository;
	
    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User saveUser(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        user.setActive(true);
        Role role = roleRepository.findByRole("ROLE_USER");
        user.setRole(role);
        return userRepository.save(user);
    }
}
