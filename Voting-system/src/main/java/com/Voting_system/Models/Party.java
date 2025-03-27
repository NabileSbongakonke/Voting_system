package com.Voting_system.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Party {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String name;
public Party() {}
public Party( String name) {
	super();
	
	this.name = name;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
