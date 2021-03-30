package com.nez.StaffAchievementManagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class AppController {

	
	@GetMapping("/")
	public String viewHome() {
		return "home";
	}
	
	@GetMapping("about")
	public String viewAbout() {
		return "about";
	}

	
	

}
