package com.kh.kej;

public class Customer {

	private String name;
	private int phone;
	private String address;
	private String day;
	private String time;
	private String pay;
	
	public Customer() {}
	
	public Customer(String name, int phone, String address, String day, String time, String pay) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.day = day;
		this.time = time;
		this.pay = pay;
	}
	
	public String getName() {
			return this.name;
	}
	
	public int getPhone() {
			return this.phone;
	}
	
	public String getAddress() {
			return this.address;
	}
	public String getDay() {
			return this.day;
	}
	public String getTime() {
			return this.time;
	}
	public String getPay() {
			return this.pay;
	}
	
	public void setName(String name) {
			this.name = name;
	}
	
	public void setPhone(int phone) {
			this.phone = phone;
	}
	
	public void setAddress(String address) {
			this.address = address;
	}
	public void setDay(String day) {
			this.day = day;
	}
	public void setTime(String time) {
			this.time = time;
	}
	public void setPay(String pay) {
			this.pay = pay;
	}

}
