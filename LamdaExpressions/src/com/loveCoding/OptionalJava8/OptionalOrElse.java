package com.loveCoding.OptionalJava8;

import java.util.Optional;

public class OptionalOrElse {


	public static void main(String[] args) {
		Optional<String> nonEmptyValue=Optional.of("value");
		Optional<String> emptyValue=Optional.empty();
		
		System.out.println(nonEmptyValue.orElse("N/A"));
		System.out.println(emptyValue.orElse("Something"));
		
		System.out.println(nonEmptyValue.orElseGet(()->"Nothing"));
		System.out.println(emptyValue.orElseGet(()->{
			return "Something";
		}));
		
		
		
	}
}
