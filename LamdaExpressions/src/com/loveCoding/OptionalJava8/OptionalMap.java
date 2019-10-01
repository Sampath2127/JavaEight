package com.loveCoding.OptionalJava8;

import java.util.Optional;

public class OptionalMap {

	public static void main(String[] args) {
		
		Optional<String> nonEmptyValue=Optional.of("value");
		Optional<String> emptyValue=Optional.empty();
		
		System.out.println("Non-Empty optional: "+nonEmptyValue.map(String::toUpperCase));
		System.out.println("Empty Optional: "+emptyValue.map(String::toUpperCase)); 
		
		Optional<Optional<String>> nonEmptyOptionalVal = Optional.of(Optional.of("value"));
		System.out.println("Optional value :: "+ nonEmptyOptionalVal);
		System.out.println("Optional map : "+nonEmptyOptionalVal.map(x->x.map(String::toUpperCase)));
		System.out.println("Optional.flatMap : "+nonEmptyOptionalVal.flatMap(x->x.map(String::toUpperCase)));
		
	}
}
