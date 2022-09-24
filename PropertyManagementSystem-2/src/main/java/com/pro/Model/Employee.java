package com.pro.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Employee {

	@Id
	@GeneratedValue
	public int empId;
	public String empName;
	public int empPhoneNo;
	public String empOffice;
	public String empPassword;
	
	public Employee() {
		super();
		//TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpPhoneNo() {
		return empPhoneNo;
	}
	public void setEmpPhoneNo(int empPhoneNo) {
		this.empPhoneNo = empPhoneNo;
	}
	public String getEmpOffice() {
		return empOffice;
	}
	public void setEmpOffice(String empOffice) {
		this.empOffice = empOffice;
	}
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPhoneNo=" + empPhoneNo + ", empOffice="
				+ empOffice + ", empPassword=" + empPassword + "]";
	}
	
	
}
