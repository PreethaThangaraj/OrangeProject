package polimorphismConcept;

public class ParameterizedConstructor {
	ParameterizedConstructor(int a,int b,int c){
		System.out.println("a");
		System.out.println("b");
		System.out.println("a+b="+c);
		System.out.println("Addition of two number is:"+c);
		
	}
	
	ParameterizedConstructor(String name,boolean f){
		System.out.println("name");
		System.out.println("f");
	}
public static void main(String[] args) {
	ParameterizedConstructor p = new ParameterizedConstructor(10,20,30);
    
	new ParameterizedConstructor("karthika",true);
}

}
