package com.lovecoding.lamdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	
	public static void main(String[] args) {
		
		List<String> bingoNumbers = Arrays.asList("N40", "N36", "B12", "B67", "G53", "G70", "G60", "G90", "K90", "K70",
				"000", "097", "g69");
		Employe sam=new Employe("Sam Kom", 27); 
		Employe pam=new Employe("Pamela Clark", 25);
		Employe john=new Employe("John Wick", 23);
		Employe snow=new Employe("John Snow", 26);
		Employe tyrion=new Employe("tyrion Lanister", 35);
		
		 Department hr=new Department("Human Resources");
		 
		 hr.addEmployee(sam);
		 hr.addEmployee(john);
		 hr.addEmployee(snow);
		 
		 Department accounts=new Department("Accounting");
		 accounts.addEmployee(tyrion);
		 accounts.addEmployee(pam);
		 
		 List<Department> departments=new ArrayList<>();
		 departments.add(hr);
		 departments.add(accounts);
		 
//		 Stream<Employe> flatMap = departments.stream().flatMap(department -> department.getEmployees().stream());
//		 System.out.println(flatMap.peek(System.out::println).count());
		 departments.stream().flatMap(department -> department.getEmployees().stream()).forEach(System.out::println);
		 
		 System.out.println("==================================================================================");
//		 List<String> sortedGNumbers = bingoNumbers.stream()
//				 .map(String::toUpperCase)
//				 .filter(s->s.startsWith("G")).
//				 sorted().
//				 collect(Collectors.toList());
		 
		 List<String> sortedGNumbers = bingoNumbers.stream()
				 .map(String::toUpperCase)
				 .filter(s->s.startsWith("G")).
				 sorted().
				 collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
		 
		 sortedGNumbers.forEach(System.out::println);
		 
		 System.out.println("=================================================AGE============================================");
		 
		 Map<Integer, List<Employe>> groupedByAge = departments.stream().flatMap(department->department.getEmployees().stream())
		 .collect(Collectors.groupingBy(employee->employee.getAge()));
		 
		 departments.stream().flatMap(department->department.getEmployees().stream())
		 .reduce((e1,e2)-> e1.getAge()<e2.getAge() ? e1:e2)
		 .ifPresent(System.out::println);
		 
		 System.out.println("=============================================!!!!============================================");
		 Stream.of("ABC", "AC", "DEF", "FGH", "iJKL").filter(s->{
			 System.out.println(s);
			 return s.length()==3;
		 }).count();
	}
}
