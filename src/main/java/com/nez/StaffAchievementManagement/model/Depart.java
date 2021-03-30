package com.nez.StaffAchievementManagement.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departs")
public class Depart {
	@Id
	private int id;
	private String name;
	@OneToMany(mappedBy = "depart", cascade = CascadeType.ALL)
	private Collection<Staff> staffs;

	public Depart() {
	}

	public Depart(int id, String name, Collection<Staff> staffs) {
		super();
		this.id = id;
		this.name = name;
		this.staffs = staffs;
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

	public Collection<Staff> getStaffs() {
		return staffs;
	}

	public void setStaffs(Collection<Staff> staffs) {
		this.staffs = staffs;
	}

	@Override
	public String toString() {
		return "Depart [id=" + id + ", name=" + name + ", staffs=" + staffs + "]";
	}

}
