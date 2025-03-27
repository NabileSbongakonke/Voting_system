package com.Voting_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Voting_system.Models.Party;

public interface PartyRepository extends JpaRepository<Party,Long> {

}
