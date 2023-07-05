package com.controlStatement;

public class ReverseString {

	public static void main(String[] args) {
	   String s= "JASMINE";
       int length = s.length();
       System.out.println(length);
       String r = "";
       System.out.println("---------------");
       
	for(int i = s.length()-1; i>=0; i--) {
        r = r +s.charAt(i);
		System.out.println(r);
	}
	}
}

