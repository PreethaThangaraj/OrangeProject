package polyOverriding;

public class Teacher extends Collage {
	
	@Override
	public void studentCount() {
		System.out.println("48");
		
	}
	@Override
	
	public void gender() {
		System.out.println("Boys=40," +"Girls=10" );
	}

public void teacher() {
	System.out.println("10");
}	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teacher tr=new Teacher();
tr.studentCount();
tr.gender();
tr.teacher();
}
}