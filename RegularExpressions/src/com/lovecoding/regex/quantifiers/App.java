package com.lovecoding.regex.quantifiers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

	public static void main(String[] args) {
		
		
		String regexQ="abcdeeeDeeJkhiiiiJl12354564HHHftTTjLL..HHiiiiiJHKLKIABCDeeGFDee";
		
		System.out.println(regexQ.replaceAll("^abcde{3}", "YYY")); // quantifier {3} upto 3 occurance
		System.out.println(regexQ.replaceAll("^abcde+", "YYY")); //will match for repeated occurance of last character
		System.out.println(regexQ.replaceAll("^(?i)abcde*", "YYY")); // will match for repeated occurance as well as if the alphabet is not present will replace upto there
		System.out.println(regexQ.replaceAll("^abcde{2,5}", "YYY"));//replaces the occurances between specified constraints
		System.out.println(regexQ.replaceAll("(?i).h+i*j", "YYY"));
		
		
		StringBuilder patternData=new StringBuilder("<H1>Hi My name is Sampath</H1>");
		patternData.append("<h2><p>I love to code and learn<p></h2>");
		patternData.append("<h1>love to code using Java</h1>");
		patternData.append("<h2>love technology</h2>");
		patternData.append("<h3>end of topic.....kjkds.</h3>");
		
		//Pattern pattern=Pattern.compile(".*<h2>.*");
		Pattern pattern=Pattern.compile("<h2>");
		Matcher matcher=pattern.matcher(patternData);
		System.out.println(matcher.matches()); // a matcher can only be used once
		
		matcher.reset();
		int count=0;
		while(matcher.find()){
			count++;
			System.out.println("Occurrence "+count+" : "+matcher.start()+" to "+ matcher.end());
		}
		
		//String h2GroupPattern="(<h2>)"; //()group pattern
		String h2GroupPattern="(<h2>.*?</h2>)"; //()group pattern --- adding ? will make quantifier * lazy to look in between provided pattern
		Pattern grpPattern=Pattern.compile(h2GroupPattern);
		Matcher grpMatcher=grpPattern.matcher(patternData);
		
		System.out.println(grpMatcher.matches());
		matcher.reset();
		
		while(grpMatcher.find()){
			System.out.println("Occurrence: "+grpMatcher.group(1));
		}
		
		System.out.println("=====matching text between patterns=====");
		String h2TextGroups= "(<h2>)(.+?)(</h2>)" ; // 3 separate groups
		Pattern textpattern=Pattern.compile(h2TextGroups);
		Matcher textMatcher=textpattern.matcher(patternData);
		
		while(textMatcher.find()){
			System.out.println("Occurrence: "+textMatcher.group(2));
		}
	}
}
