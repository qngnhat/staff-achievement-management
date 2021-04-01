package com.nez.StaffAchievementManagement.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "staffs")
public class Staff {
	@Id
	private int id;
	private String name;
	private boolean gender;
	private String birthday;
	private String photo;
	private String email;
	private String phone;
	private int salary;
	@ManyToOne
	@JoinColumn(name = "depart_id")
	private Depart depart;
	@OneToMany(mappedBy = "staff", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Collection<Record> records;

	public Staff() {
	}

	public Staff(int id, String name, boolean gender, String birthday, String photo, String email, String phone,
			int salary, Depart depart, Collection<Record> records) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.photo = photo;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.depart = depart;
		this.records = records;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Depart getDepart() {
		return depart;
	}

	public void setDepart(Depart depart) {
		this.depart = depart;
	}

	public Collection<Record> getRecords() {
		return records;
	}

	public void setRecords(Collection<Record> records) {
		this.records = records;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday + ", photo="
				+ photo + ", email=" + email + ", phone=" + phone + ", salary=" + salary + ", depart=" + depart + "]";
	}



}