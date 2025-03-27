package com.Voting_system.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Voting_system.Models.Party;
import com.Voting_system.Models.User;
import com.Voting_system.Models.Vote;
import com.Voting_system.services.PartyService;
import com.Voting_system.services.UserService;
import com.Voting_system.services.Voteservice;

import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class UserController {
	private final UserService userService;
	private final PartyService partyService;
	private final Voteservice voteservice;
	public UserController(UserService userService, PartyService partyService,Voteservice voteservice) {
		this.userService=userService;
		this.partyService=partyService;
		this.voteservice=voteservice;
	}
	
	@GetMapping("/Home.html")
	public String home() {
		
		return"Home.html";
	}
	
	
@GetMapping("/Login.html")
public String Login() {
	
	return "Login.html";
}

@GetMapping("/Register.html")
String Register(Model model) {
	
	model.addAttribute("user", new User());
	
	return "Register.html";
}

@GetMapping("/Vote.html")
public String vote(Model model)
{
	List<Party> parties=partyService.getAllParties();
	model.addAttribute("parties",parties);
	model.addAttribute("vote",new Vote());
	
return "Vote.html";	
}

@GetMapping("/Logout.html")
public String logout(HttpSession session) {
    session.invalidate(); // Invalidate the session
    return "redirect:/Home.html"; // Redirect to the login page (or any other page)
}

@PostMapping("/register.html")
public String Registeruser(@ModelAttribute User user,RedirectAttributes redirectAttributes) {
	
  userService.saveUser(user);
	
	return "login.html";
	
}
@PostMapping("/login.html")
public String login(@RequestParam String email,@RequestParam String password,HttpSession session) {
	
	
	if(userService.findByEmailAndPassword(email,password) != null) {
		User user=userService.findbyemail(email);
		session.setAttribute("username", user.getName());
		session.setAttribute("user", user.getId());
		return "Loggedin.html";
	}
	return "";
}



@GetMapping("/Loggedin.html")
public String getloginTemp(HttpSession session,Model model) {
    Long user=(Long)session.getAttribute("user");
    String name=(String)session.getAttribute("username");
    if(user==null) {
    	return "Home.html";
    }
   
    return "Loggedin.html";
}
@PostMapping("/vote")
public String postvote(@ModelAttribute Vote vote,@RequestParam String party,HttpSession session,RedirectAttributes redirectAttributes) {
    //TODO: process POST request
    Long userid=(Long) session.getAttribute("user");
    vote.setUser_id(userid);
    vote.setParty(party);
    voteservice.saveVote(vote);
    return "Loggedin.html";
}


}
