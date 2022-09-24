package com.pro.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	public int custId;
	public  String custName;
	public int custPhn;
	public String custAdd;
	public String custEnq;


	public Customer() {
		super();
		//TODO Auto-generated constructor stub
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustPhn() {
		return custPhn;
	}
	public void setCustPhn(int custPhn) {
		this.custPhn = custPhn;
	}
	public String getCustAdd() {
		return custAdd;
	}
	public void setCustAdd(String custAdd) {
		this.custAdd = custAdd;
	}
	public String getCustEnq() {
		return custEnq;
	}
	public void setCustEnq(String custEnq) {
		this.custEnq = custEnq;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custPhn=" + custPhn + ", custAdd=" + custAdd
				+ ", custEnq=" + custEnq + "]";
	}
}
