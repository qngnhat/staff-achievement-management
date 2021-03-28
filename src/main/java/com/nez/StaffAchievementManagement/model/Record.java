package com.nez.StaffAchievementManagement.model;


import javax.persistence.Entity;
import javax.persistence.Id;
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
	public Record() {
	}

	public Record(int id, boolean type, String reason, String date) {
		super();
		this.id = id;
		this.type = type;
		this.reason = reason;
		this.date = date;
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

	@Override
	public String toString() {
		return "Record [id=" + id + ", type=" + type + ", reason=" + reason + ", date=" + date + "]";
	}


	



}
