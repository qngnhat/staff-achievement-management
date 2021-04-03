package com.nez.StaffAchievementManagement.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nez.StaffAchievementManagement.model.Record;
import com.nez.StaffAchievementManagement.model.StaffPoint;
import com.nez.StaffAchievementManagement.repository.RecordRepository;

@Controller
public class AppController {

	@Autowired
	RecordRepository recordRepository;

	private List<StaffPoint> listStaff;
	
	@GetMapping("/")
	public String viewHome(Model model, HttpServletRequest request) {
		model.addAttribute("records", recordRepository.findAll());
		System.out.println(getListStaffPoints());
		return "home";
	}

	@GetMapping("about")
	public String viewAbout() {
		return "about";
	}
	
	public List<StaffPoint> getListStaffPoints(){
		List<Record> records = recordRepository.findAll();
		
		for(Record r : records) {
			System.out.println(r);
		}
		return listStaff;
	}

}
