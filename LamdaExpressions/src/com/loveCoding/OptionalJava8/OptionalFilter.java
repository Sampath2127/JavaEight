package com.loveCoding.OptionalJava8;

import java.util.Optional;

public class OptionalFilter {

	public static void main(String[] args) {
		
		Optional<String> nonEmptyValue=Optional.of("value");
		Optional<String> emptyValue=Optional.empty();
		
		//Filter an optional
		System.out.println(nonEmptyValue.filter(x->x.equals("val")));
		System.out.println(nonEmptyValue.filter(x->x.equalsIgnoreCase("VALUE")));
		System.out.println(emptyValue.filter(x->x.equalsIgnoreCase("value")));
	}
}
