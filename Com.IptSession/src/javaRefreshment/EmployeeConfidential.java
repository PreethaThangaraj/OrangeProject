package javaRefreshment;

public class EmployeeConfidential extends Company{

	public static void main(String[] args) {
	 Company c = new Company();
	 c.setCompanyName("CTS");
	 String companyName = c.getCompanyName();
	 System.out.println(companyName);
	 c.setEmployeeCode(123456);
     int employeeCode = c.getEmployeeCode();
     System.out.println(employeeCode);
     c.setEmployeeName("jasmine");
     String str =c.getEmployeeName();
     System.out.println(str);
     c.setMobileNum(9876543210l);
     long num = c.getMobileNum();
     System.out.println(num);
    
	}

}
