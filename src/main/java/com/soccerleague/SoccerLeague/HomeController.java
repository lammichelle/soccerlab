package com.soccerleague.SoccerLeague;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.soccerleague.SoccerLeague.repo.MembersRepository;
import com.soccerleague.SoccerLeague.repo.TeamsRepository;

@Controller
public class HomeController {

	@Autowired 
	MembersRepository memberRepo;
	
	@Autowired
	TeamsRepository teamRepo;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	
	@RequestMapping("/members")
	public ModelAndView members() {
		return new ModelAndView("members", "members", memberRepo.findAll());
	}
	
	@RequestMapping("/teams")
	public ModelAndView teams() {
		return new ModelAndView("teams", "teammy", teamRepo.findAll());
	}
}
