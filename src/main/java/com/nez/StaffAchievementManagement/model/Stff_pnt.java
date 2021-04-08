package com.nez.StaffAchievementManagement.model;

public class Stff_pnt {
	int sid;
	String staff;
	String depart;
	int point;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStaff() {
		return staff;
	}
	public void setStaff(String staff) {
		this.staff = staff;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "Stff_pnt [staff=" + staff + ", depart=" + depart + ", point=" + point + "]";
	}
	
}
