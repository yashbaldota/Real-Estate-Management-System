package com.pro.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id
	@GeneratedValue
	public int AdminId;
	public String AdminName;
	public String Password;
	
	
	public Admin() {
		super();
		//TODO Auto-generated constructor stub
	}
	public int getAdminId() {
		return AdminId;
	}
	public void setAdminId(int adminId) {
		AdminId = adminId;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Admin [AdminId=" + AdminId + ", AdminName=" + AdminName + ", Password=" + Password + "]";
	}
	

	
}
