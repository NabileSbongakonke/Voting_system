package com.Voting_system.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {
@GetMapping("/")
public String homepage() {
	
	
	return"home";
}



}
