package com.loveCoding.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		List<Integer> numbersList=new ArrayList<>();
		
		for(int i=1; i<=10; i++){
			numbersList.add(i*i+100);
		}
		  
		Stream<Integer> seqStream=numbersList.stream();
		
		Stream<Integer> parallelStream=numbersList.parallelStream();
		
		//Stream<Integer> sequence = seqStream.filter(x->x>10);
		
		//seqStream.forEach(System.out::println);
		
		parallelStream.forEach(System.out::println);
	}
}
