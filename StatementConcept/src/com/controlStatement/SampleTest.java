package com.controlStatement;

public class SampleTest {
	
	public void name(int a,int b, int c){
		a=10;
	    b=20;
	 c=a+b;
		System.out.println("enter the value:" +c);
	}
	private void name(int a,int b,float f){
		
		
		System.out.println("the value is" +f);
	}

	void name(String s, boolean h,int c) {
		System.out.println("Enter the name" +s +h +c);
	}
	public static void main(String[] args) {
		
		SampleTest s= new SampleTest();
		s.name(10,20, 30);
		s.name(30, 40, 0.2f);
		s.name("jasmine", false, 60);
		
	}
	
}
