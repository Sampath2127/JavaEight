package com.lovecoding.lamdaexpressions;

public class Employe {
	
	private String name;
	private int age;
	
	public Employe(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
