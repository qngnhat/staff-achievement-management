package com.nez.StaffAchievementManagement.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nez.StaffAchievementManagement.model.User;
import com.nez.StaffAchievementManagement.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	UserRepository userRepository;

	
	@GetMapping("index")
	public String viewUsers(Model model) {
		List<User> users = userRepository.findAll();

		model.addAttribute("users", users);
		return "user";
	}
	
	
	@RequestMapping("add")
	public String addUser(User user, Model model) {
		userRepository.save(user);
		List<User> users = userRepository.findAll();
		model.addAttribute("users", users);
		return "user";
	}
	
	@GetMapping("{id}")
	public String viewUser(@PathVariable("id") int id, Model model) {
		User users = userRepository.findById(id).orElse(null);
		model.addAttribute("users", users);
		
		return "user";
	}
	
	@RequestMapping	("update")
	public String updateUser(User user, Model model) {
		userRepository.save(user);
		List<User> users = userRepository.findAll();
		model.addAttribute("users", users);
		return "user";
	}
	
	@RequestMapping("delete/{id}")
	public String deleteUser(@PathVariable("id") int id, Model model) {
		User user = userRepository.getOne(id);
		userRepository.delete(user);
		
		List<User> users = userRepository.findAll();
		model.addAttribute("users", users);
		return "user";
	}
	
	
}
