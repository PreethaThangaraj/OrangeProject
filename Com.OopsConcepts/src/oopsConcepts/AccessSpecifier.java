package oopsConcepts;
public class AccessSpecifier {
	public void schoolName() {
		System.out.println("ANTONY PRIMARY SCHOOL");
	}
	public void correspondentName() {
		System.out.println("RAJADURAI");
		}
	private Void corresContact() {
		System.out.println("9876543217");
		return null;
	}
	protected void principalName() {
		System.out.println("SELVAM");
	}
	void totalTeacher() {
		System.out.println("10");
	}
    private void totalStudent() {
	System.out.println("150");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifier sch=new AccessSpecifier();
		sch.schoolName();
		sch.correspondentName();
		sch.corresContact();
		sch.principalName();
		sch.totalTeacher();
		sch.totalStudent();
	}
}
