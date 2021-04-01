package com.nez.StaffAchievementManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nez.StaffAchievementManagement.model.Record;
import com.nez.StaffAchievementManagement.repository.RecordRepository;

@Controller
public class AppController {

	@Autowired
	RecordRepository recordRepository;

	@GetMapping("/")
	public String viewHome(Model model) {
		List<Record> records = recordRepository.findAll();

		model.addAttribute("records", records);
		return "home";
	}

	@GetMapping("about")
	public String viewAbout() {
		return "about";
	}

}
