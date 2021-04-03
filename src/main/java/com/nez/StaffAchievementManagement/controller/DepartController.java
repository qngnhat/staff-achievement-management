package com.nez.StaffAchievementManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nez.StaffAchievementManagement.model.Depart;
import com.nez.StaffAchievementManagement.repository.DepartRepository;

@Controller
public class DepartController {

	@Autowired
	DepartRepository departRepository;

	@GetMapping("/depart")
	public String viewDeparts(Model model) {
		model.addAttribute("departs", departRepository.findAll());
		return "depart";
	}

	@GetMapping("/depart/new")
	public String formDepart(Model model) {
		model.addAttribute("depart", new Depart());
		return "depart-form";
	}

	@PostMapping("/depart/save")
	public String saveDepart(Depart depart) {
		departRepository.save(depart);
		return "redirect:/depart";
	}

	@GetMapping("/depart/edit/{id}")
	public String editDepartForm(@PathVariable("id") Integer id, Model model) {
		Depart depart = departRepository.findById(id).get();
		model.addAttribute("depart", depart);
		return "depart-form";
	}

	@RequestMapping("/depart/delete/{id}")
	public String deleteDepart(@PathVariable("id") Integer id, Model model) {
		departRepository.deleteById(id);
		return "redirect:/depart";
	}
}
