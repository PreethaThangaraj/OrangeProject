package com.controlStatement;

public class ExceptionConcept {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		int e=5;
		
		System.out.println(a+b+c+d+e);
		
		try {
			String[] s=new String[5];
			s[1]="a";
			s[2]="b";
			s[3]="c";
			s[4]="d";
			s[5]="e";
			
			System.out.println(s[1] +"," +s[2] +"," +s[3] +"," +s[4] +"," +s[5]);
		}
	//	catch (Exception ex) {
	//				System.out.println("Program start");
	//				int h=7;
	//				System.out.println(h);
	//				System.out.println("Exit");
	//			}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Program start");
			int h1=8;
			System.out.println(h1);
			System.out.println("Exit");
		}
		finally{
			System.out.println("Program ends");
		}
	//	catch (Exception ex) {
	//		System.out.println("Program start");
	//		int h=7;
	//		System.out.println(h);
	//		System.out.println("Exit");
	//	}
System.out.println("THE END");
	}

}
