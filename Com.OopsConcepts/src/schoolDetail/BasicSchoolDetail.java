package schoolDetail;

import oopsConcepts.AccessSpecifier;
//if we call the method of one package in another package import that package class name
public class BasicSchoolDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AccessSpecifier s=new AccessSpecifier();
s.schoolName();
//public access specifier can call outside package 
s.correspondentName();
	}
}
