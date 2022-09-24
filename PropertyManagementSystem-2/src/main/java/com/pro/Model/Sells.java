package com.pro.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sells {

	@Id
	@GeneratedValue
	public int id;
	public String buildName;
	public int floorNo;
	public int shopNo;
	public int flatNo;
	public String customerName;
	public String customerPhn;
	public String customerAdd;
	public String customerAadhaar;
	public String customerPan;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBuildName() {
		return buildName;
	}
	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public int getShopNo() {
		return shopNo;
	}
	public void setShopNo(int shopNo) {
		this.shopNo = shopNo;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhn() {
		return customerPhn;
	}
	public void setCustomerPhn(String customerPhn) {
		this.customerPhn = customerPhn;
	}
	public String getCustomerAdd() {
		return customerAdd;
	}
	public void setCustomerAdd(String customerAdd) {
		this.customerAdd = customerAdd;
	}
	public String getCustomerAadhaar() {
		return customerAadhaar;
	}
	public void setCustomerAadhaar(String customerAadhaar) {
		this.customerAadhaar = customerAadhaar;
	}
	public String getCustomerPan() {
		return customerPan;
	}
	public void setCustomerPan(String customerPan) {
		this.customerPan = customerPan;
	}
	@Override
	public String toString() {
		return "Sites [id=" + id + ", buildName=" + buildName + ", floorNo=" + floorNo + ", shopNo=" + shopNo
				+ ", flatNo=" + flatNo + ", customerName=" + customerName + ", customerPhn=" + customerPhn
				+ ", customerAdd=" + customerAdd + ", customerAadhaar=" + customerAadhaar + ", customerPan="
				+ customerPan + "]";
	}
	
	
	
	
	
}
