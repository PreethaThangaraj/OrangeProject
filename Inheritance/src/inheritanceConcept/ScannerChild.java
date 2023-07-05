package inheritanceConcept;

public class ScannerChild extends ScannerConcept {
		
		public void employeeContact() {
			System.out.println("9876543215");
		}
		private void employeeGender() {
			System.out.println("Female");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ScannerChild si=new ScannerChild();
			si.officeName();
			si.employeeName();
			si.employeeGender();
			si.employeeID();
			si.employeeDesignation();
			si.employeeContact();

		}

}
