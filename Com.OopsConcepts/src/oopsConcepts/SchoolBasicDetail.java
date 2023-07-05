package oopsConcepts;

public class SchoolBasicDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AccessSpecifier a =new AccessSpecifier();
a.schoolName();
//public can access inside the package with another class
a.correspondentName();
a.principalName();
//protected can access inside the package with another class but access in outside package use extends
a.totalTeacher();
//default can be access only in package
	}
}
