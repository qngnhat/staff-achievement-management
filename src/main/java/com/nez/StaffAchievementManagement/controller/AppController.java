package com.nez.StaffAchievementManagement.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nez.StaffAchievementManagement.model.staff_point;
import com.nez.StaffAchievementManagement.repository.RecordRepository;
import com.nez.StaffAchievementManagement.repository.staff_pointRepo;

@Controller
public class AppController {

	@Autowired
	RecordRepository recordRepository;
	@Autowired
	staff_pointRepo staff_pointRepo;

	@GetMapping("/")
	public String viewHome(Model model, HttpServletRequest request) {
		model.addAttribute("records", recordRepository.findAll());
		model.addAttribute("listStaff", listStaff_points());

		return "home";
	}

	@GetMapping("about")
	public String viewAbout() {
		return "about";
	}
	
	private List<staff_point> listStaff_points(){
		List<staff_point> Oldlist = staff_pointRepo.findAll();
		List<staff_point> Newlist = new ArrayList<staff_point>();
		for(int i=0; i<5;i++) {
			Newlist.add(Oldlist.get(i));
		}
		System.out.println(Newlist);
		return Newlist;
	}

}
