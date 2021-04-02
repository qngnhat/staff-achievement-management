package com.nez.StaffAchievementManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nez.StaffAchievementManagement.model.Depart;
import com.nez.StaffAchievementManagement.repository.DepartRepository;

@Controller
@RequestMapping("depart")
public class DepartController {

	@Autowired
	DepartRepository departRepository;
	
	@GetMapping("")
	public String viewDeparts (Model model) {
		List<Depart> departs = departRepository.findAll();
		
		model.addAttribute("departs", departs);
		return "depart";
	}
	
	@RequestMapping("add")
	public String addDepart(Depart depart, Model model) {
		departRepository.save(depart);
		List<Depart> departs = departRepository.findAll();
		model.addAttribute("departs", departs);
		return "depart";
	}
	
	@GetMapping("{id}")
	public String viewDepart(@PathVariable("id") int id, Model model) {
		Depart departs = departRepository.findById(id).orElse(null);
		model.addAttribute("departs", departs);
		
		return "depart";
	}
	
	
	@RequestMapping	("update")
	public String updateDepart(Depart depart, Model model) {
		departRepository.save(depart);
		List<Depart> departs = departRepository.findAll();
		model.addAttribute("departs", departs);
		return "depart";
	}
	
	@RequestMapping("delete/{id}")
	public String deleteDepart(@PathVariable("id") int id, Model model) {
		Depart depart = departRepository.findById(id).orElseThrow();
		departRepository.delete(depart);
		
		List<Depart> departs = departRepository.findAll();
		model.addAttribute("departs", departs);
		return "depart";
	}
}
