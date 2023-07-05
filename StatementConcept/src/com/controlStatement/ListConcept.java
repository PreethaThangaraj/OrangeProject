package com.controlStatement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListConcept {

	public static void main(String[] args) {
		
		//List<Integer>b=new ArrayList<>();
		List<Integer> num = new ArrayList<>();

		num.add(10);
		num.add(15);
		num.add(25);
		num.add(10);
		num.add(45);
		num.add(50);
		num.add(25);
		
		System.out.println(num);
		
		System.out.println("The End");
		
		System.out.println(num.size());
		
		System.out.println(num.get(5));
		
		System.out.println(num.set(4, 25));
		System.out.println(num);
		System.out.println(num.remove(5));
		System.out.println(num);
		
		List<Integer> l = new LinkedList<>();
		
		l.add(0);
		l.add(89);
		l.add(90);
		l.add(25);
	l.addAll(num);
	System.out.println("Before" +l);
	
	
//	l.removeAll("num");
//	System.out.println("the value" +l);
	
	l.retainAll(num);
	System.out.println(l);
    System.out.println();
	}
}
