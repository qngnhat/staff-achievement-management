package com.nez.StaffAchievementManagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nez.StaffAchievementManagement.repository.top5_staffRepository;


@Controller
public class AppController {
	@Autowired
	top5_staffRepository repo;
	
	@GetMapping("/")
	public String viewHome() {
		return "home";
	}

	
	

}
