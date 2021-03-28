package com.nez.StaffAchievementManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.nez.StaffAchievementManagement.model.User;
import com.nez.StaffAchievementManagement.repository.UserRepository;

@Controller
public class AppController {
	
	@GetMapping("/")
	public String viewHome() {
		return "home";
	}

	

}
