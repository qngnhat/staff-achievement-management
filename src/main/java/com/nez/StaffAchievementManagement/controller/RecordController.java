package com.nez.StaffAchievementManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
		model.addAttribute("records", new Record());
		model.addAttribute("listStaff", staffRepository.findAll());
		return "record-form";
	}

	@PostMapping("/record/save")
	public String saveRecord(Record record) {
		recordRepository.save(record);
		return "redirect:/record";
	}

//	@GetMapping("{id}")
//	public String viewRecord(@PathVariable("id") int id, Model model) {
//		Record records = recordRepository.findById(id).orElse(null);
//		model.addAttribute("records", records);
//		
//		return "record";
//	}
//	
//	@RequestMapping	("update")
//	public String updateRecord(Record record, Model model) {
//		recordRepository.save(record);
//		List<Record> records = recordRepository.findAll();
//		model.addAttribute("records", records);
//		return "record";
//	}
//	
//	@RequestMapping("delete/{id}")
//	public String deleteRecord(@PathVariable("id") int id, Model model) {
//		Record record = recordRepository.getOne(id);
//		recordRepository.delete(record);
//		
//		List<Record> records = recordRepository.findAll();
//		model.addAttribute("records", records);
//		return "record";
//	}
}
