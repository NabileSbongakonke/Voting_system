package com.Voting_system.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Voting_system.Models.User;
import com.Voting_system.repositories.UserRepository;

@Service
public class UserService {
private UserRepository userRepository;
public UserService( UserRepository userRepository) {
	
	this.userRepository=userRepository;
}

public List<User> allusers(){
	
	return userRepository.findAll();
}

public User saveUser(User user) {
	
	return userRepository.save(user);
}

public Optional<User> findByEmailAndPassword(String email ,String password) {
	
	return userRepository.findByEmailAndPassword(email,password);
}
public User findbyemail(String email) {
	
	
	return userRepository.findByEmail(email);
}
 
}
