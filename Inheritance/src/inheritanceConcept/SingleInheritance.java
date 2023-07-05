package inheritanceConcept;

public class SingleInheritance extends OfficeDetail {
	
	public void employeeContact() {
		System.out.println("9876543215");
	}
	private void employeeGender() {
		System.out.println("Female");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	SingleInheritance si=new SingleInheritance();
	SingleInheritance s = new MultilevelInherit();  // parentclass variable name = new child class()
	s.officeName();
//	MultilevelInherit m = new SingleInheritance();
//	m.officeName();
		
	//	si.employeeName();
	//	si.employeeGender();
	//	si.employeeID();
	//	si.employeeDesignation();
	//	si.employeeContact();

		
		
	}
}
