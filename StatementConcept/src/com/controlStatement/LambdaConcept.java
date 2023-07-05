package com.controlStatement;
interface number{
	void value();
}
public class LambdaConcept {

	public static void main(String[] args) {
	number name=()->{
		System.out.println("Enter the num name:");
	};
	//name.program();
	number key=()->System.out.println("the num key();");

	}

}
