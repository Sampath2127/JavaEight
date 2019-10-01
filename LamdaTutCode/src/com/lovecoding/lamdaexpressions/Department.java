package com.lovecoding.lamdaexpressions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sampath Komsani
 *
 */
public class Department {
	
	private String name;
	private List<Employe> employees;
	
	public Department(String name) {
		this.name = name;
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(Employe employee){
		employees.add(employee);
	}
	
	public List<Employe> getEmployees(){
		return employees;
	}
	
}
