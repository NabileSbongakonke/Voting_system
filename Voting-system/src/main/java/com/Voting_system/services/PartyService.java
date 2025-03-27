package com.Voting_system.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Voting_system.Models.Party;
import com.Voting_system.repositories.PartyRepository;

@Service
public class PartyService {
	private PartyRepository partyrepository;
	public PartyService(PartyRepository partyrepository) {
		this.partyrepository=partyrepository;
		
	}
	
	
	
public List<Party> getAllParties(){
	
	return partyrepository.findAll();
}


}
