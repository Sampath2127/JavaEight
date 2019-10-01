package com.loveCoding.Comparators;

import java.util.ArrayList;
import java.util.List;

import com.loveCoding.OptBeans.User;

public class Comparators {

	private static List<User> list=new ArrayList<>();
	public static void main(String[] args) {
		
		//Adding some user names for sorting using comparators
		User user1=new User("Lax", 33);
		User user2=new User("Nar", 44);
		User user3=new User("Sam", 26);
		User user4=new User("Bha", 23);
		User user5=new User("San", 28);
		
		
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		list.add(user5);
		
		
		//Traditional usage of comparators
//		Comparator<User> byName=new Comparator<User>(){
//
//			@Override
//			public int compare(User u1, User u2) {
//				return u1.getUserName().compareTo(u2.getUserName());
//			}
//			
//		};
		
		//Comparator for sorting Names using Java 8 Lambda
		
		/*Comparator<User> byName=(User u1, User u2)
				->u1.getUserName().compareTo(u2.getUserName());*/
		list.sort((User u1, User u2)->u1.getUserName().compareTo(u2.getUserName()));
		System.out.println("Sorting by Names....! \n");
		list.forEach((User)->System.out.println(User.getUserName()));
		System.out.println("\nSorting by Age.....! \n");
		list.sort((User u1, User u2)-> u1.getAge()-u2.getAge());
		list.forEach(User->System.out.println(User));
	}

}
