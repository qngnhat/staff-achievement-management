package com.nez.StaffAchievementManagement;


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
public class StaffAchievementManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StaffAchievementManagementApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	DepartRepository departRepository;
	
	@Autowired
	StaffRepository staffRepository;
	
	@Autowired
	RecordRepository recordRepository;
	
	@Override
	public void run(String... args) throws Exception {

		User user = new User(1, "admin", "admin");
		User user1 = new User(2, "nez", "nez");
		
		
		Depart depart = new Depart( 1 , "Tiền đạo");
		Depart depart1 = new Depart(2, "Tiền vệ");
		Depart depart2 = new Depart(3, "Hậu vệ");
		Depart depart3 = new Depart(4, "Thủ Môn");
		Depart depart4 = new Depart(5, "Dự bị");

		
		Staff staff = new Staff(1, "Iker Casillas", true, "1985-05-11", "/resources/images/casillas.png", "qngnhat@gmail.com", "0983212321", 100000);
		Staff staff1 = new Staff(2, "Pepe", false, "1985-05-11", "/resources/images/pepe.png", "qngnhat@gmail.com", "0983212321", 120000);
		Staff staff2 = new Staff(3, "Dani Carvajal", true, "1987-01-22", "/resources/images/carvajal.png", "qngnhat@gmail.com", "0983212321", 150000);
		Staff staff3 = new Staff(4, "Sergio Ramos", false, "1986-11-10", "/resources/images/ramos.png", "qngnhat@gmail.com", "0983212321", 120000);
		Staff staff4 = new Staff(5, "Varane", false, "1992-02-19", "/resources/images/varane.png", "qngnhat@gmail.com", "0983212321", 140000);

		depart3.getStaffs().add(staff);
		depart2.getStaffs().add(staff1);
		depart2.getStaffs().add(staff2);
		depart2.getStaffs().add(staff3);
		depart2.getStaffs().add(staff4);

		Record record = new Record(1, true, "Tích cực tham gia tấn công", "2021-02-21");
		Record record1 = new Record(2, false, "Xử lý lỗi nhiều", "2021-02-21");
		Record record2 = new Record(3, true, "Phạm lỗi nhiều", "2021-02-24" );
		Record record3 = new Record(4, false, "Ghi bàn thắng", "2021-03-12");
		Record record4 = new Record(5, true, "Phòng ngự tốt","2021-03-17");
		
		staff.getRecords().add(record);
		staff3.getRecords().add(record1);
		staff1.getRecords().add(record2);
		staff4.getRecords().add(record3);
		staff.getRecords().add(record4);
		this.userRepository.save(user);
		this.userRepository.save(user1);
		this.departRepository.save(depart);
		this.departRepository.save(depart1);
		this.departRepository.save(depart2);
		this.departRepository.save(depart3);
		this.departRepository.save(depart4);
		this.staffRepository.save(staff);
		this.staffRepository.save(staff1);
		this.staffRepository.save(staff2);
		this.staffRepository.save(staff3);
		this.staffRepository.save(staff4);
		this.recordRepository.save(record);
		this.recordRepository.save(record1);
		this.recordRepository.save(record2);
		this.recordRepository.save(record3);
		this.recordRepository.save(record4);
	}

}
