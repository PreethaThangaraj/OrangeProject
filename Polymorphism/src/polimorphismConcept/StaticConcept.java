package polimorphismConcept;

public class StaticConcept {
	
	static String n="JASMINE";
	static int i =12345;
	static boolean b=true;
	
	public static void method1(){
		i=12345;
		System.out.println(i);
	}
    public static void method2() {
	    String n="JASMINE";
	    System.out.println("Confirm my name:" +b);
}
    public static void main(String[] args) {
		StaticConcept sc = new StaticConcept();
		sc.method1();
		sc.method2();
	//	System.out.println(StaticConcept.n);
		//System.out.println(StaticConcept.i);
	//	System.out.println(StaticConcept.b);
	}
    
    
    
    
    
}

