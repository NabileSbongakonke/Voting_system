package com.Voting_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Voting_system.Models.Vote;

public interface Voterepository extends JpaRepository<Vote, Long> {

}
