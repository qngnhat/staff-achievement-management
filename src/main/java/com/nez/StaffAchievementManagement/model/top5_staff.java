package com.nez.StaffAchievementManagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class top5_staff{
	@Id
	private String name;
	private int resault;
	private String depart_name;
	
	public top5_staff() {
	}

	public top5_staff(String name, int resault, String depart_name) {
		super();
		this.name = name;
		this.resault = resault;
		this.depart_name = depart_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getResault() {
		return resault;
	}

	public void setResault(int resault) {
		this.resault = resault;
	}

	public String getDepart_name() {
		return depart_name;
	}

	public void setDepart_name(String depart_name) {
		this.depart_name = depart_name;
	}

	@Override
	public String toString() {
		return "top5_staff [name=" + name + ", resault=" + resault + ", depart_name=" + depart_name + "]";
	}
	
	
}
