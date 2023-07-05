package com.controlStatement;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class MapConcept {

	public static void main(String[] args) {
LinkedHashMap<String,String> s = new LinkedHashMap<>();
		
		s.put("JAS" , "10");
		s.put("INDHU" , "50");
		s.put("PREETHA" , "30");
		s.put("KARTHI" , "100");
		s.put("RINCY","25");
		s.put("DURGA","60");
		s.put("HERMINA","96");
		
		System.out.println(s);

		s.put("RINCY", "25");
		int size = s.size();
		System.out.println(size);
		
		String string = s.get("JAS");
		System.out.println(string);
		
		System.out.println(s.keySet());
		System.out.println(s.values());
		
	boolean containsKey = s.containsKey("PREETHA");
	System.out.println(string);
	System.out.println("---------------");
	
	boolean containsValue = s.containsValue("100");	
	System.out.println(containsValue);	
	System.out.println("----------------");	
	
	boolean empty = s.isEmpty();
	System.out.println(empty);
	System.out.println("---------------");
	
	System.out.println(s.entrySet());
	 
	s.clear();
	System.out.println(s);
	
	boolean empty2 = s.isEmpty();
	System.out.println(empty2);
	
	}

}
