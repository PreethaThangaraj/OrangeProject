package inheritanceConcept;
import java.util.Scanner;
public class ScannerEmpConcept {
Scanner sc = new Scanner(System.in);
public void empName(){
	String n=sc.nextLine();
	System.out.println("Enter the Emp Name:"+n);
	}
public void companyName() {
	String c="CTS";
	System.out.println("Enter the CompanyName:"+c);
}
public void empID() {
	System.out.println("Enter the EmpID:");
	int e=sc.nextShort();	
}
protected void EmpPerformance() {
	System.out.println("Performance report:");
	float f=sc.nextFloat();
	System.out.println("Examresult:");
	System.out.println("pass");
	boolean b=sc.nextBoolean();
	System.out.println("Manager Confirmation:"+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ScannerEmpConcept emp = new ScannerEmpConcept();
emp.empName();
emp.companyName();
emp.empID();
emp.EmpPerformance();
	}

}
