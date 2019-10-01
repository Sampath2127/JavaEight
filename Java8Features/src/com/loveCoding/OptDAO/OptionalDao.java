package com.loveCoding.OptDAO;

import com.loveCoding.OptBeans.Address;
import com.loveCoding.OptBeans.User;

public class OptionalDao {
	private Address address;
	private User user1;
	
	public User getUser(){
		address=new Address();
		address.setStreet("Sylvan way");
		address.setState("New Jersey");
		address.setCountry("USA");
		user1=new User("Sam", address);
		return user1;
	}
}
