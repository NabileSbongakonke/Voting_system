package com.Voting_system.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Voting_system.Models.Party;
import com.Voting_system.services.PartyService;



@Controller
public class PartyController {
private PartyService partyService;
public PartyController(PartyService partyService) {
	this.partyService=partyService;
	
}





}
