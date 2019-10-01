package com.lovecoding.lamdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class LambdaFunctions {

	public static void main(String[] args) {
		new Thread(()-> {
			System.out.println("Running thread using Lambda..!");
			System.out.println("Running thread using Lambda Line 2..!");
			System.out.println("Running thread using Lambda Line 3..!");
			}).start();	
		
		Employe sam=new Employe("Sam Kom", 27);
		Employe ram=new Employe("Ram Sita", 101);
		Employe lax=new Employe("Lax Man", 101);
		
		List<Employe> empList=new ArrayList<>();
		
		empList.add(sam);
		empList.add(ram);
		empList.add(lax);
		
		/*for(Employee emp: empList){
			System.out.println(emp.getName());
			new Thread(()->System.out.println(emp.getAge())).start();;
		}*/
		empList.forEach(employee->{
			System.out.println(employee.getName());
			System.out.println(employee.getAge());
		});
		/*Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				// 
				return emp1.getName().compareTo(emp2.getName());
			}
		});*/
		
		/*Collections.sort(empList, (Employee emp1, Employee emp2)->
		emp1.getName().compareTo(emp2.getName()));
		
		for(Employee emp: empList) System.out.println(emp.getName());
	*/
		
		/*String  str=doStringStuff(new UpperConcat() {
		@Override
		public String upperConcat(String s1, String s2) {
			
			return s1.toUpperCase()+s2.toUpperCase();
		}
	}, empList.get(0).getName(), empList.get(1).getName());*/
	
		// UpperConcat uc=(s1, s2) -> s1.toUpperCase()+s2.toUpperCase();
		
/*		UpperConcat uc=(s1, s2)->{
			return s1.toUpperCase()+s2.toUpperCase(); // to include multiple line statements return statement is mandatory in this case
		};
		String concatString=doStringStuff(uc, empList.get(0).getName(), empList.get(1).getName());
		System.out.println(concatString);*/
		
		AnotherClass anotherClass=new AnotherClass();
		String str=anotherClass.doSomething();
		System.out.println(str);
		anotherClass.printValue();
		
		
	}
	
	public final static String doStringStuff(UpperConcat uc, String s1, String s2){
		return uc.upperConcat(s1, s2);
	}
}


class Employee{
	
	private String name;
	private int age;
	
	public Employee(String name, int age) {
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

	public void setAge(int age) {
		this.age = age;
	}
	
}
	interface UpperConcat{
		public String upperConcat(String s1, String s2);
	}
	
	class AnotherClass{
		
		public String doSomething(){
			
			 int i=0;
	
			 UpperConcat uc =(s1, s2)->{
				 System.out.println("The Lamdbda expression's class is "+getClass().getSimpleName());
				 System.out.println("i (inside annonymous class):"+ i);
				 return s1.toUpperCase()+s2.toUpperCase();
			 };
			 
			 System.out.println("Another class name is : "+getClass().getSimpleName());
				
			return LambdaFunctions.doStringStuff(uc, "Sam", "Kom");
		}
		
		public void printValue(){
		int number =25;
		
		Runnable r=()->{
			try{
				Thread.sleep(3000);
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
			System.out.println("The value of number is : "+ number);
			
		};
		
		new Thread(r).start();
		}
	}
	
 