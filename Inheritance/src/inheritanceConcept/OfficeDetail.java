package inheritanceConcept;
public class OfficeDetail {
	public void officeName() {
		System.out.println("CTS");
	}
	private void officeAddress() {
		System.out.println("chennai");
		}
	protected void employeeName() {
		System.out.println("Anitha");
	}
	protected void employeeID() {
		System.out.println("56725");
	}
	private void employeeIncome() {
		System.out.println("40000");
	}
	void employeeDesignation() {
		System.out.println("Associate");
	}
	public static void main(String[] args) {
		OfficeDetail ofc =new OfficeDetail(); {
		ofc.officeName();
		ofc.officeAddress();
		ofc.employeeName();
		ofc.employeeID();
		ofc.employeeDesignation();
		ofc.employeeIncome();
		}
	}
		}
