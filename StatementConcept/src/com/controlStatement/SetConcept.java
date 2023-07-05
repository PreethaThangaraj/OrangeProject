package com.controlStatement;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<>();
		
		s.add("10");
		s.add("50");
		s.add("30");
		s.add("100");
		s.add("25");
		s.add("60");
		s.add("96");
		
		System.out.println(s);
		System.out.println("-----------");
		
		Set<String> i = new LinkedHashSet<>();
		i.add("jasmine");
		i.add("preetha");
		i.add("indhu");
		i.add("mathi");
		i.add("karthiga");
		
		System.out.println(i);
	
		boolean contains = i.contains(i);
		System.out.println(contains);
		System.out.println("-------------");
		
		Set<Integer> st = new TreeSet<>();
		
		st.add(7000);
		st.add(1000);
		st.add(25);
		st.add(96);
		st.add(600);
		
		System.out.println(st);
		System.out.println("------------");
 		System.out.println(s.addAll(s));
 		int size = st.size();
 		System.out.println(size);
 		
 		boolean remove = st.remove(1000);
 		System.out.println(remove);
 		
 		boolean containsAll = st.containsAll(i);
 		System.out.println(containsAll);
 		
 		boolean empty = st.isEmpty();
 		System.out.println(   );

	}

}
