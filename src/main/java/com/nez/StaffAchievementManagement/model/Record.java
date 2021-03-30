package com.nez.StaffAchievementManagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "records")
public class Record {
	@Id
	private int id;
	private boolean type;
	private String reason;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String date;
	@ManyToOne
	@JoinColumn(name = "staff_id")
	private Staff staff;

	public Record() {
	}

	public Record(int id, boolean type, String reason, String date, Staff staff) {
		super();
		this.id = id;
		this.type = type;
		this.reason = reason;
		this.date = date;
		this.staff = staff;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return "Record [id=" + id + ", type=" + type + ", reason=" + reason + ", date=" + date + ", staff=" + staff
				+ "]";
	}

}
