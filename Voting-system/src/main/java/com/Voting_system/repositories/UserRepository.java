package com.Voting_system.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Voting_system.Models.User;

public interface UserRepository extends JpaRepository<User,Long>{
	Optional<User> findByEmailAndPassword(String email,String password);
	User findByEmail(String email);
}
