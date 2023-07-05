package polimorphismConcept;

public class ConstructorConcept {
	
	ConstructorConcept(){
		System.out.println("Addition:");
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("Enter the num:" +c);	
	}
	ConstructorConcept(String name, boolean f) {
		System.out.println("JASMINE");
		System.out.println("f");
	}
	
	public static void main(String[] args) {
		new ConstructorConcept();
		
	}
	
}
