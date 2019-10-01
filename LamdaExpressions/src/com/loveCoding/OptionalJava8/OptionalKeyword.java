package com.loveCoding.OptionalJava8;

import java.util.Optional;

public class OptionalKeyword {

	public static void main(String[] args) {
		
		Optional<String> name=Optional.of("Sam");
		
		String x1="x1x1x1";
		String x2 = null;
		
		System.out.println("Non-Empty Optional: "+name);
		System.out.println("Non-Empty Optional: Name value: "+name.get());
		
		System.out.println("Empty Optional: "+Optional.empty());
		System.out.println("ofNullable on Non-Empty Optional: "+Optional.ofNullable(x1));
		System.out.println("ofNullable on Empty Optional: "+Optional.ofNullable(x2));
		
		System.out.println("Of on empty optional: "+Optional.of(x1));
		
	}

}
