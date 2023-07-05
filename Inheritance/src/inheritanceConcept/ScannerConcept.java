package inheritanceConcept;

import java.util.Scanner;

public class ScannerConcept {//parent class
	//syntax-Scanner refName=new Scanner(System.in);
	Scanner sc=new Scanner(System.in);
	public void officeName() {
		String o=sc.next();
		String o1="TCS";
		System.out.println("Enter the office Name:"+o);
	}
	private void officeAddress() {
		System.out.println("Office Access branch is:");
		String a=sc.nextLine();
		String b=sc.nextLine();
		System.out.println("Now I am working in:"+b);
		}
	protected void employeeName() {
		String e=sc.next();
		System.out.println("Anitha");
	}
	protected void employeeID() {
		System.out.println("EmployeeID:");
		int i =sc.nextInt();
		System.out.println("56725");
	}
	private void employeeIncome() {
		System.out.println("40000");
	}
	void employeeDesignation() {
		System.out.println("Associate");
	}
	public static void main(String[] args) {
		ScannerConcept ofc =new ScannerConcept(); {
		ofc.officeName();
		ofc.officeAddress();
		ofc.employeeName();
		ofc.employeeID();
		ofc.employeeDesignation();
		ofc.employeeIncome();
		}
	}
	
}
