package com.nez.StaffAchievementManagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	private int id;
	private String username;
	private String password;
	private boolean role;
	@OneToOne
	@JoinColumn(name = "staff_id")
	private Staff staff;

	public User() {
	}

	public User(int id, String username, String password, boolean role, Staff staff) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.staff = staff;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isRole() {
		return role;
	}

	public void setRole(boolean role) {
		this.role = role;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + ", staff="
				+ staff + "]";
	}

}
