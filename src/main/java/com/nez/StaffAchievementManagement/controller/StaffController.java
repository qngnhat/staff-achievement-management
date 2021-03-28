package com.nez.StaffAchievementManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nez.StaffAchievementManagement.model.Staff;
import com.nez.StaffAchievementManagement.repository.StaffRepository;

@Controller
@RequestMapping("staff")
public class StaffController {

	@Autowired
	StaffRepository staffRepository;
	
	@GetMapping("index")
	public String viewStaffs (Model model) {
		List<Staff> staffs = staffRepository.findAll();
		
		model.addAttribute("staffs", staffs);
		return "staff/index";
	}
	
	@GetMapping("add-staff")
	public String viewAddStaff() {
		return "staff/add-staff";
	}
	
	@RequestMapping("add")
	public String addStaff(Staff staff, Model model) {
		staffRepository.save(staff);
		List<Staff> staffs = staffRepository.findAll();
		model.addAttribute("staffs", staffs);
		return "staff/index";
	}
	
	@GetMapping("{id}")
	public String viewStaff(@PathVariable("id") int id, Model model) {
		Staff staffs = staffRepository.findById(id).orElse(null);
		model.addAttribute("staffs", staffs);
		
		return "staff/index";
	}
	
	@GetMapping("update-staff")
	public String viewUpdateStaff() {
		return "staff/update-staff";
	}
	
	@RequestMapping	("update")
	public String updateStaff(Staff staff, Model model) {
		staffRepository.save(staff);
		List<Staff> staffs = staffRepository.findAll();
		model.addAttribute("staffs", staffs);
		return "staff/index";
	}
	
	@RequestMapping("delete/{id}")
	public String deleteStaff(@PathVariable("id") int id, Model model) {
		Staff staff = staffRepository.getOne(id);
		staffRepository.delete(staff);
		
		List<Staff> staffs = staffRepository.findAll();
		model.addAttribute("staffs", staffs);
		return "staff/index";
	}
}
