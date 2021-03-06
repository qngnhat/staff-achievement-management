package com.nez.StaffAchievementManagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nez.StaffAchievementManagement.model.Staff;
import com.nez.StaffAchievementManagement.repository.DepartRepository;
import com.nez.StaffAchievementManagement.repository.StaffRepository;

@Controller
public class StaffController {
	@Autowired
	StaffRepository staffRepository;
	
	@Autowired
	DepartRepository departRepository;
	
	@GetMapping("/staff")
	public String viewStaffs(Model model) {
		model.addAttribute("staffs", staffRepository.findAll());
		System.out.println(staffRepository.findAll());
		return "staff";
	}

	@GetMapping("/staff/new")
	public String formStaff(Model model) {
		model.addAttribute("staff", new Staff());
		model.addAttribute("listDepart", departRepository.findAll());
		return "staff-form";
	}
	
	@PostMapping("/staff/save")
	public String saveStaff(Staff staff) {
		staffRepository.save(staff);
		return "redirect:/staff";
	}

	@GetMapping("/staff/edit/{id}")
	public String editStaffForm(@PathVariable("id") Integer id, Model model) {
		Staff staff = staffRepository.findById(id).get();
		model.addAttribute("staff", staff);
		model.addAttribute("listDepart", departRepository.findAll());
		return "staff-form";
	}

	@RequestMapping("/staff/delete/{id}")
	public String deleteStaff(@PathVariable("id") Integer id, Model model) {
		staffRepository.deleteById(id);
		return "redirect:/staff";
	}
}
