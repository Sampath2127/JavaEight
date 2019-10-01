package com.loveCoding.lambdas;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMap {

	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
	    map.put(1, "linode.com");
	    map.put(2, "heroku.com");

	    //filter by key
	    
	    String result = map.entrySet().stream()
	    		.filter(x->x.getKey()==2)
	    		.map(x->x.getValue())
	    		.collect(Collectors.joining());
	    
	    System.out.println(result);
		
	}

}
