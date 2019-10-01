package com.lovecoding.regex;

public class App {

	
	public static void main(String[] args) {
		String regexStr="kjkkkkseteuliuodhdAHDJDJKLUO<kjkkkLPIDJMk12312335dhj";
		
		System.out.println(regexStr.replaceAll("[k]", "X"));
		System.out.println(regexStr.replaceAll("[^se2d]", "Y"));
		System.out.println(regexStr.replaceAll("[^se2]", "YYY"));
		System.out.println(regexStr.replaceAll("[se2d]", "Y"));
		System.out.println(regexStr.replaceAll("[a-jA-J1-3]", "X"));
		System.out.println(regexStr.replaceAll("(?i)[a-j1-3]", "X"));//?i ignores case sensitivity
		System.out.println(regexStr.replaceAll("\\d", "X"));//replaces integers
		System.out.println(regexStr.replaceAll("\\D", "X")); //replaces non-digit characters
		
		String hasWhiteSpaces= "I have blanks and \ta tab, and a new line\n";
		
		System.out.println(hasWhiteSpaces);
		System.out.println(hasWhiteSpaces.replaceAll("\\s", ""));//remove white spaces
		System.out.println(hasWhiteSpaces.replaceAll("\t", ""));
		System.out.println(hasWhiteSpaces.replaceAll("\\S", ""));
		
		System.out.println(regexStr.replaceAll("\\w", "X"));//replaces all alphabets and integers with character
		System.out.println(regexStr.replaceAll("\\W", "X"));//replaces all non alphanumeric with letter
		System.out.println(hasWhiteSpaces.replaceAll("\\b", "X"));//surrounds each word with the letter 
		System.out.println(regexStr.replaceAll("^kjk{4}", "YYY"));//replaces upto 4 characters provided in Quantifier {3}
		System.out.println(regexStr.replaceAll("[j-k]{3}", "YYY"));
	}
}
