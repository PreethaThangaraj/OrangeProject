package polimorphismConcept;

public class LocalVariable {

	public void method1() {
		int a;
		a=10;
		int b;
		b=20;
		int c=a+b;
		System.out.println("Enter the value:" +c);
	}
	public void method2() {
	String s="JASMINE";
	String st="EXAM RESULT:PASS";
	boolean f=true;
	System.out.println("All entered value are true");
	
	}
	public static void main(String[] args) {
	
		LocalVariable l=new LocalVariable();
		l.method1();
		l.method2();
	}
	
	}
