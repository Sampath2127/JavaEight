package com.lovecoding.regex.logicaloperators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

	
	public static void main(String[] args) {
		
		String text="tdxxtsstdtftdxhatjztd"; //end matching will not be displayed when using ^ (carrot symbol) use negate !
					 
		System.out.println("harry".replaceAll("[Hh]arry", "Larry"));
		System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
		
		//not ^abc
		//String tNotdRegex="t[^d]"; // t not followed by d
		//! abc
		//String tNotdRegex="t(?!d)"; // lookahead doesn't include the characters they match and length will be counted for 1 EX: d isn't counted
		String tNotdRegex="t(?=d)"; // lookahead will count the matching characters in this case
		Pattern tnotdPattern= Pattern.compile(tNotdRegex);
		Matcher tNotdmatcher=tnotdPattern.matcher(text);
		int count=0;
		while(tNotdmatcher.find()){
			count++;
			System.out.println("Occurence "+ count+ " : "+tNotdmatcher.start()+" to "+tNotdmatcher.end());
		}
		
		String phonenumber="(123)-456-7890";
		
		String phoneNumPattern="^([\\(]{1}[0-9]{3}[\\)]{1}[\\-]{1}[0-9]{3}[\\-]{1}[0-9]{4})$";
		
		Pattern phoneNumPatterns=Pattern.compile(phoneNumPattern);
		
		Matcher phoneNumMatcher=phoneNumPatterns.matcher(phonenumber);
		
		System.out.println(phoneNumMatcher.matches());
		
		//visa card pattern ^4[0-9]{12}([0-9]{3})?$ matches 4444444444444 or 4444444444444444
	}
}
