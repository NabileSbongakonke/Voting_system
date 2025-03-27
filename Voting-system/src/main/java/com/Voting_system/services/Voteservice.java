package com.Voting_system.services;

import org.springframework.stereotype.Service;

import com.Voting_system.Models.Vote;
import com.Voting_system.repositories.Voterepository;

@Service
public class Voteservice {
private Voterepository voterepository;
public Voteservice(Voterepository voterepository) {
	
	this.voterepository=voterepository;
}

public Vote saveVote(Vote vote) {
	
	return voterepository.save(vote);
}



}
