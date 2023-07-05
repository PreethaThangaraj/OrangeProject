package polyOverriding;

public class Principal extends Collage {

	public void studentCount() {
		System.out.println("Total student in class-A");
		super.studentCount();
		System.out.println("48");
		
	}
	public void gender() {
		super.gender();
		System.out.println("Boys=40," +"Girls=10" );
	}

public void teacher() {
	super.teacher();
	System.out.println("10");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Principal pr =new Principal();

pr.studentCount();
pr.teacher();
pr.gender();
	}

}
