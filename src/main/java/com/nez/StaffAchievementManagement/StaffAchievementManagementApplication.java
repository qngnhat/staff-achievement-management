package com.nez.StaffAchievementManagement;


import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nez.StaffAchievementManagement.model.Depart;
import com.nez.StaffAchievementManagement.model.Record;
import com.nez.StaffAchievementManagement.model.Staff;
import com.nez.StaffAchievementManagement.model.User;
import com.nez.StaffAchievementManagement.repository.DepartRepository;
import com.nez.StaffAchievementManagement.repository.RecordRepository;
import com.nez.StaffAchievementManagement.repository.StaffRepository;
import com.nez.StaffAchievementManagement.repository.UserRepository;

@SpringBootApplication
public class StaffAchievementManagementApplication{

	public static void main(String[] args) {
		SpringApplication.run(StaffAchievementManagementApplication.class, args);
	}
//
//	@Autowired
//	UserRepository userRepository;
//	
//	@Autowired
//	DepartRepository departRepository;
//	
//	@Autowired
//	StaffRepository staffRepository;
//	
//	@Autowired
//	RecordRepository recordRepository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		Depart depart1 = new Depart();depart1.setId(1); depart1.setName("Truyền thông");
//		Depart depart2 = new Depart();depart2.setId(2); depart2.setName("Thiết kế");
//		Depart depart3 = new Depart();depart3.setId(3); depart3.setName("Thi công");
//		
//		departRepository.saveAndFlush(depart1);
//		departRepository.saveAndFlush(depart2);
//		departRepository.saveAndFlush(depart3);
//
//		Staff staff1 = new Staff(); staff1.setId(1);staff1.setName("Iker Casillas");staff1.setGender(true);staff1.setBirthday("1985-05-11");staff1.setPhoto("casillas.png");staff1.setEmail("qngnhat@gmail.com");staff1.setPhone("0983212321");staff1.setSalary(100000);staff1.setDepart(depart1);
//		Staff staff2 = new Staff(); staff2.setId(2);staff2.setName("Pepe");staff2.setGender(false); staff2.setBirthday("1985-05-11");staff2.setPhoto("pepe.png");staff2.setEmail("qngnhat@gmail.com");staff2.setPhone("09843122311");staff2.setSalary(100000);staff2.setDepart(depart1);
//		Staff staff3 = new Staff(); staff3.setId(3);staff3.setName("Dani Carvajal");staff3.setGender(true);staff3.setBirthday("1985-02-15");staff3.setPhoto("carvajal.png");staff3.setEmail("qngnhat@gmail.com");staff3.setPhone("0983892344");staff3.setSalary(130000);staff3.setDepart(depart2);
//		Staff staff4 = new Staff(); staff4.setId(4);staff4.setName("Sergio Ramos");staff4.setGender(false);staff4.setBirthday("1986-11-10");staff4.setPhoto("ramos.png");staff4.setEmail("qngnhat@gmail.com");staff4.setPhone("0987567651");staff4.setSalary(170000);staff4.setDepart(depart3);
//		
//		staffRepository.saveAndFlush(staff1);
//		staffRepository.saveAndFlush(staff2);
//		staffRepository.saveAndFlush(staff3);
//		staffRepository.saveAndFlush(staff4);
//
//		
//		User user1 = new User();user1.setId(1); user1.setUsername("admin");user1.setPassword("admin");user1.setRole(true);user1.setStaff(staff1);
//		User user2 = new User();user2.setId(2); user2.setUsername("nez");user2.setPassword("nez");user2.setRole(false);user2.setStaff(staff2);
//	
//		Record record1 = new Record();record1.setId(1); record1.setType(true);record1.setReason("Hoàn thành tốt công việc");record1.setDate("2021-02-21");record1.setStaff(staff2);
//		Record record2 = new Record();record2.setId(2); record2.setType(false);record2.setReason("Đi làm muộn");record2.setDate("2021-02-21");record2.setStaff(staff1);
//		Record record3 = new Record();record3.setId(3); record3.setType(false);record3.setReason("Chậm deadline");record3.setDate("2021-02-21");record3.setStaff(staff1);
//		Record record4 = new Record();record4.setId(4); record4.setType(true);record4.setReason("Hoàn thành tốt công việc");record4.setDate("2021-02-21");record4.setStaff(staff3);
//
//		userRepository.saveAndFlush(user1);
//		userRepository.saveAndFlush(user2);
//		
//		recordRepository.saveAndFlush(record1); 
//		recordRepository.saveAndFlush(record2); 
//		recordRepository.saveAndFlush(record3); 
//		recordRepository.saveAndFlush(record4); 
//		
//		
//		
		
		
//		depart1.setStaffs(Collections.singleton(staff1));
//		departRepository.saveAndFlush(depart1);
//		
//		depart1.setStaffs(Collections.singleton(staff2));
//		departRepository.saveAndFlush(depart1);
//		
//		depart2.setStaffs(Collections.singleton(staff3));
//		departRepository.saveAndFlush(depart2);
//		
//		depart3.setStaffs(Collections.singleton(staff4));
//		departRepository.saveAndFlush(depart3);
		
//		staff1.setRecords(Collections.singleton(record2));
//		staffRepository.saveAndFlush(staff1);
//		
//		staff1.setRecords(Collections.singleton(record3));
//		staffRepository.saveAndFlush(staff1);

		
//		staff2.setRecords(Collections.singleton(record1));
//		staffRepository.saveAndFlush(staff2);
//		
//		staff3.setRecords(Collections.singleton(record4));
//		staffRepository.saveAndFlush(staff3);
		
		
		
		
//	}
}
