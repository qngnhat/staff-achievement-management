package com.nez.StaffAchievementManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

	@GetMapping("/user/edit/{id}")
	public String editUserForm(@PathVariable("id") Integer id, Model model) {
		User user = userRepository.findById(id).get();
		model.addAttribute("user", user);
		model.addAttribute("listStaff", staffRepository.findAll());
		return "user-form";
	}

	@RequestMapping("/user/delete/{id}")
	public String deleteUser(@PathVariable("id") Integer id, Model model) {
		userRepository.deleteById(id);
		return "redirect:/user";
	}
}
