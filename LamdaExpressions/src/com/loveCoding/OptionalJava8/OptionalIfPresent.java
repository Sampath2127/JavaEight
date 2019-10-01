package com.loveCoding.OptionalJava8;

import java.util.Optional;

public class OptionalIfPresent {

	public static void main(String[] args) {
		
		Optional<String> nonEmptyValue=Optional.of("value");
		Optional<String> emptyValue=Optional.empty();
		
		if(nonEmptyValue.isPresent()){
			System.out.println("Val is present");
		}else{
			System.out.println("val not available");
		}
		
		nonEmptyValue.ifPresent(x->System.out.println("Value available ... play with it"));
		emptyValue.ifPresent(x->System.out.println("Val is not present"));
		

	}

}
