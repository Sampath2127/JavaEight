package com.loveCoding.lambdas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

public class LamdaExpressions {

	public static void main(String[] args) {
	
		// sorting lists using Lambda
	List<Developer> listDevs = getDevelopers();
		
	System.out.println("Before sort");
	for(Developer developer: listDevs){
		System.out.println(developer);
		}
		
	
	System.out.println("\n after sort..!");
	
	/*
	Collections.sort(listDevs, new Comparator<Developer>(){
	

	@Override
	public int compare(Developer o1, Developer o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	});
	
	for(Developer developer: listDevs){
		System.out.println(developer);
	}
	*/
		
		
	// lambda expressions to sort lists
	//	listDevs.sort((Developer dev1, Developer dev2)->dev1.getName().compareTo(dev2.getName()));
	
	listDevs.sort(( dev1,  dev2)->dev1.getAge()-dev2.getAge());
	
	listDevs.forEach((developer)->System.out.println(developer));
	
	
	// Sorting Map using Lambda
	
	System.out.println("\n sorting maps...!");
	Map<String, Integer> ageMap=new HashMap<>();
	ageMap.put("Sam", 28);
	ageMap.put("Adam", 78);
	ageMap.put("Elezabeth", 89);
	ageMap.put("Doom", 81);
	ageMap.put("Tommy", 58);
	ageMap.put("Pami", 18);
	
	ageMap.forEach((key, value)->System.out.println("key : "+key+" value : "+value));
	
	//filtering lists using Lambda 8
	
	System.out.println("\nfiltering lists using Lambda 8");
			List<String> namesList=Arrays.asList("Sam", "Pam", "Calm", "Ram");
			
			List<String> result=namesList.stream()
					.filter(line->!"Calm".equals(line))
					.collect(Collectors.toList());
			
			result.forEach(System.out::println);
			
	//findAny using Lamda
			
			System.out.println("\nfindAny/Orelse using Lamda");
			
			List<Person> personsList=Arrays.asList(new Person("Sam", 28),new Person("Ram", 81),new Person("Pam", 35),new Person("Jam", 25));
			
			Person person=personsList.stream()
					.filter(name->"Sam".equals(name.getName()))
					.findAny()
					.orElse(null);
			
			System.out.println(person);
		
	//Java 8 Maps
			
			List<String> alpha=Arrays.asList("a","b","c","d","e");
			List<String> upperCaseList=alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
			upperCaseList.forEach(x->System.out.println(x));
			
			
			
	}
	

	private static List<Developer> getDevelopers() {

			List<Developer> result = new ArrayList<Developer>();

			result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
			result.add(new Developer("alvin", new BigDecimal("80000"), 20));
			result.add(new Developer("jason", new BigDecimal("100000"), 10));
			result.add(new Developer("iris", new BigDecimal("170000"), 55));
			
			return result;

		}
		
	
		
	
}
