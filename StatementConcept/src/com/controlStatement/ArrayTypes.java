package com.controlStatement;
import java.util.Arrays;
public class ArrayTypes {
	//Array syntax=Datatype variablename[] = new Datatype [length]
	public static void array() {
	int st[] = new int[10];
	
	st[0]=10;
	st[1]=20;
	st[2]=30;
	st[3]=40;
	st[4]=50;
	
System.out.println("," +st[1] +st[0] +st[3]);        // method 1=printed by normal sys out
System.out.println("-----THE END-----");

for(int i=0; i<=9; i++) {                //method 2=calling using for loop	
	System.out.println(st[i]);	
}
	System.out.println("-----------");
	for (int k : st) {                  //method 3= call by for each loop	
		System.out.println(k);		
	}
	System.out.println("***************");
	System.out.println(Arrays.toString(st));  //method 4 = import array using static variable
	}
	public static void main(String[] args) {
		array();                            // using static method call the variable by using method name
	}                                       //   no need to create object
}
