package com.nez.StaffAchievementManagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nez.StaffAchievementManagement.model.Depart;
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
		return "staff";
	}

	@GetMapping("/staff/new")
	public String formStaff(Model model) {
		model.addAttribute("staff", new Depart());
		model.addAttribute("listDepart", departRepository.findAll());
		return "staff-form";
	}
	
	@PostMapping("/staff/save")
	public String saveStaff(Staff staff) {
		staffRepository.save(staff);
		return "redirect:/staff";
	}

//	@GetMapping("{id}")
//	public String viewStaff(@PathVariable("id") int id, Model model) {
//		Staff staffs = staffRepository.findById(id).orElse(null);
//		model.addAttribute("staffs", staffs);
//
//		return "staff";
//	}
//
//	@RequestMapping("update")
//	public String updateStaff(Staff staff, Model model) {
//		staffRepository.save(staff);
//		List<Staff> staffs = staffRepository.findAll();
//		model.addAttribute("staffs", staffs);
//		return "staff";
//	}
//
//	@RequestMapping("delete/{id}")
//	public String deleteStaff(@PathVariable("id") int id, Model model) {
//		Staff staff = staffRepository.getOne(id);
//		System.out.println(staff.getId());
//		staffRepository.delete(staff);
//
//		model.addAttribute("staffs", staffRepository.findAll());
//		return "staff";
//	}

}
