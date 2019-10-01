package com.lovecoding.lamdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.omg.Messaging.SyncScopeHelper;

public class LambdaStreams {

	public static void main(String[] args) {
		List<String> bingoNumbers = Arrays.asList("N40", "N36", "B12", "B67", "G53", "G70", "G60", "G90", "K90", "K70",
				"000", "097", "g69");
		
		List<String> gNumbers=new ArrayList<>();
		
		bingoNumbers.stream().map(String::toUpperCase).filter(s -> s.startsWith("G")).sorted().forEach(System.out::println);
		
		Stream<String> ioNumberStream = Stream.of("N40", "N36", "B12", "B67", "G53");
		Stream<String> inNumberStream = Stream.of("G40", "G36", "C12", "B67", "G53");
		Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
		System.out.println("---------------------------------");
		
		System.out.println(concatStream.distinct().
				peek(System.out::println)
				.count());
		
		/*bingoNumbers.forEach(number->{
			if(number.toUpperCase().startsWith("G")){
				gNumbers.add(number);
				//System.out.println(number);
			}
		});
		
		gNumbers.sort((String s1, String s2)->s1.compareTo(s2));
		gNumbers.forEach(s->System.out.println(s));*/
	}
}
