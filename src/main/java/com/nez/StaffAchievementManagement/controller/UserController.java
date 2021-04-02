package com.nez.StaffAchievementManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nez.StaffAchievementManagement.model.User;
import com.nez.StaffAchievementManagement.repository.StaffRepository;
import com.nez.StaffAchievementManagement.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	UserRepository userRepository;

	@Autowired
	StaffRepository staffRepository;

	@GetMapping("/user")
	public String viewUsers(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "user";
	}

	@GetMapping("/user/new")
	public String formUser(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("listStaff", staffRepository.findAll());
		return "user-form";
	}

	@PostMapping("/user/save")
	public String saveUser(User user) {
		userRepository.save(user);
		return "redirect:/user";
	}
//	
//	@GetMapping("{id}")
//	public String viewUser(@PathVariable("id") int id, Model model) {
//		User users = userRepository.findById(id).orElse(null);
//		model.addAttribute("users", users);
//		
//		return "user";
//	}
//	
//	@RequestMapping	("update")
//	public String updateUser(User user, Model model) {
//		userRepository.save(user);
//		List<User> users = userRepository.findAll();
//		model.addAttribute("users", users);
//		return "user";
//	}
//	
//	@RequestMapping("delete/{id}")
//	public String deleteUser(@PathVariable("id") int id, Model model) {
//		User user = userRepository.getOne(id);
//		userRepository.delete(user);
//		
//		List<User> users = userRepository.findAll();
//		model.addAttribute("users", users);
//		return "user";
//	}
//	

}
