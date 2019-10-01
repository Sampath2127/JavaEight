package com.loveCoding.Optional;

import java.util.List;
import java.util.Optional;

import com.loveCoding.OptBeans.Address;
import com.loveCoding.OptBeans.User;
import com.loveCoding.OptDAO.OptionalDao;

public class OptionalKeyword {

	private static User user;
	private static OptionalDao optDAO=new OptionalDao();
	private static Address address;
	public static void main(String[] args) {
		String street = null;
		//creating Optional<T>
		
		Optional<String> optional=Optional.empty(); // Returns an empty optional
		
		String str="Some Value...";
		Optional.of(str); // returns an Optional with a non-null value
		
		Optional<String> optionalOf=Optional.ofNullable(getStringValue()); // Returns Optional Empty if parameter is null 
																			//or Optional with value 
		
		//Creating an new instance in case of null
		//List<String> listOptional= getList().orElseGet(()->new ArrayList<>());
		
		//conventional way to access Field Objects of Objects by making null checks
		
		/*if(optDAO!=null)
		user=optDAO.getUser();
		if(user!=null)
		address=user.getAddress();
		if(address!=null)
		{
			 street=address.getStreet();
		}
		*/
		
		//Simplifying the above usage using Optional
		
		Optional<User> user=Optional.ofNullable(optDAO.getUser());
		String result=user
				.map(User::getAddress)
				.map(Address::getStreet)
				.orElse("Not specified...");
		
		System.out.println(result);
	}

	private static List<String> getList() {
		List<String> list=null;
		return list;
	}

	private static String getStringValue() {
		return "hey Sam!";
	}
	

}
