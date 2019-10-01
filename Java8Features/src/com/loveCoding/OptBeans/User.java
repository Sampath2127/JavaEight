package com.loveCoding.OptBeans;

public class User {

	private Address address;
	private String userName;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String name, int age){
		this.userName=name;
		this.age=age;
	}
	public User(String userName, Address address){
		this.userName=userName;
		this.address=address;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", age=" + age + "]";
	}
	
	
	
	
}
