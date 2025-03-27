package com.Voting_system.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="votes")
public class Vote {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private long voteid;
private long user_id;
@Column(name="name")
private String Party;

public Vote() {} 


public Vote( long user_id, String party) {
	super();
	
	this.user_id = user_id;
	Party = party;
}


public long getVoteid() {
	return voteid;
}


public void setVoteid(long voteid) {
	this.voteid = voteid;
}


public long getUser_id() {
	return user_id;
}


public void setUser_id(long user_id) {
	this.user_id = user_id;
}


public String getParty() {
	return Party;
}


public void setParty(String party) {
	Party = party;
}



}
