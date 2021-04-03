package com.nez.StaffAchievementManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nez.StaffAchievementManagement.model.Record;
import com.nez.StaffAchievementManagement.repository.RecordRepository;
import com.nez.StaffAchievementManagement.repository.StaffRepository;

@Controller
public class RecordController {
	@Autowired
	RecordRepository recordRepository;

	@Autowired
	StaffRepository staffRepository;

	@GetMapping("/record")
	public String viewRecords(Model model) {
		model.addAttribute("records", recordRepository.findAll());
		return "record";
	}

	@GetMapping("/record/new")
	public String formRecord(Model model) {
		model.addAttribute("record", new Record());
		model.addAttribute("listStaff", staffRepository.findAll());
		return "record-form";
	}

	@PostMapping("/record/save")
	public String saveRecord(Record record) {
		recordRepository.save(record);
		return "redirect:/record";
	}

	@GetMapping("/record/edit/{id}")
	public String editRecordForm(@PathVariable("id") Integer id, Model model) {
		Record record = recordRepository.findById(id).get();
		model.addAttribute("record", record);
		model.addAttribute("listStaff", staffRepository.findAll());
		return "record-form";
	}

	@RequestMapping("/record/delete/{id}")
	public String deleteRecord(@PathVariable("id") Integer id, Model model) {
		recordRepository.deleteById(id);
		return "redirect:/record";
	}
}
