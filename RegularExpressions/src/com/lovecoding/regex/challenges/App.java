package com.lovecoding.regex.challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

	
	public static void main(String[] args) {
		String challenge1="I want a bike.";
		String challenge2="I want a ball.";
		
		System.out.println(challenge1.matches("I want a bike."));
		System.out.println(challenge2.matches("^I want a \\w+."));
		
		String patternStr="^I want a \\w+.";
		
		Pattern pattern1=Pattern.compile(patternStr);
		Matcher matcher1=pattern1.matcher(challenge2);
		
		System.out.println(matcher1.matches());
		
		String challenge4= "Replace all blanks with underscores.";
		
		System.out.println(challenge4.replaceAll("\\s", "_"));
		
		String challenge5="aaabccccccdeefffg";
		System.out.println(challenge5.matches("[a-g]+"));
		System.out.println(challenge5.matches("\\w+"));
		System.out.println(challenge5.matches("\\w*"));
		
		//challenge 6 match string 5 in its entirety
		
		System.out.println(challenge5.matches("^a{3}bc{6}de{2}f{3}g$"));
		
		String challenge7="abAcd.135";
		
		System.out.println(challenge7.matches("^(?i)([a-z]+(\\.)([0-9]+))$"));
		System.out.println(challenge7.matches("^(?i)([a-z]+[\\.][0-9]+)$"));
		System.out.println(challenge7.matches("^(?i)[a-z]+\\.\\d+$"));
		
		String challenge8= "abcd.135uvfgr567mk.7tzik.777";
		
		//String integerPattern = "(\\d*)[\\.]*((?i)[a-z]*)[\\.]*(\\d*)[\\.]*((?i)[a-z]*)";
		String integerPattern = "[a-zA-Z]*+\\.*(\\d+)"; 
		
		Pattern findIntPattern=Pattern.compile(integerPattern);
		Matcher intmatcher=findIntPattern.matcher(challenge8);
		
		while(intmatcher.find())
		System.out.println("Occurences : "+intmatcher.group(1));
	
	
		System.out.println("==================ch-9=================");
		String challenge9= "abcd.135\tuvfgr567mk.7\ttzik.777\n";
		
		
		String integerPattern9 = "[a-zA-Z]*\\.*(\\d+)"; 
		
		Pattern findIntPattern9=Pattern.compile(integerPattern9);
		Matcher intmatcher9=findIntPattern9.matcher(challenge9);
		
		while(intmatcher9.find()){
		System.out.println("Occurences : "+intmatcher9.group(1));
		}
		
		System.out.println("==========ch10==============");
		String integerPattern10 = "(\\d+)"; 
		
		Pattern findIntPattern10=Pattern.compile(integerPattern10);
		Matcher intmatcher10=findIntPattern10.matcher(challenge9);
		while(intmatcher10.find())
		System.out.println("index start : "+intmatcher10.start()+" index end : "+(intmatcher10.end()-1));
}
	
		
}
