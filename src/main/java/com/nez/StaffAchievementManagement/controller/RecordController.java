package com.nez.StaffAchievementManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nez.StaffAchievementManagement.model.Record;
import com.nez.StaffAchievementManagement.repository.RecordRepository;

@Controller
@RequestMapping("record")
public class RecordController {
	@Autowired
	RecordRepository recordRepository;
	
	@GetMapping("index")
	public String viewRecords (Model model) {
		List<Record> records = recordRepository.findAll();
		
		model.addAttribute("records", records);
		return "record/index";
	}
	
	@GetMapping("add-record")
	public String viewAddRecord() {
		return "record/add-record";
	}
	
	@RequestMapping("add")
	public String addDepart(Record record, Model model) {
		recordRepository.save(record);
		List<Record> records = recordRepository.findAll();
		model.addAttribute("records", records);
		return "record/index";
	}
	
	@GetMapping("{id}")
	public String viewRecord(@PathVariable("id") int id, Model model) {
		Record records = recordRepository.findById(id).orElse(null);
		model.addAttribute("records", records);
		
		return "record/index";
	}
	
	@GetMapping("update-record")
	public String viewUpdateRecord() {
		return "record/update-record";
	}
	
	@RequestMapping	("update")
	public String updateRecord(Record record, Model model) {
		recordRepository.save(record);
		List<Record> records = recordRepository.findAll();
		model.addAttribute("records", records);
		return "record/index";
	}
	
	@RequestMapping("delete/{id}")
	public String deleteRecord(@PathVariable("id") int id, Model model) {
		Record record = recordRepository.getOne(id);
		recordRepository.delete(record);
		
		List<Record> records = recordRepository.findAll();
		model.addAttribute("records", records);
		return "record/index";
	}
}
