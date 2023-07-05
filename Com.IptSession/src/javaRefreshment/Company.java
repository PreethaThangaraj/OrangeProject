package javaRefreshment;

public class Company {
	private static String CompanyName;
	private String EmployeeName;
	private int EmployeeCode;
	private long MobileNum;
	public  String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		this.CompanyName = companyName;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public int getEmployeeCode() {
		return EmployeeCode;
	}
	public void setEmployeeCode(int employeeCode) {
		EmployeeCode = employeeCode;
	}
	public long getMobileNum() {
		return MobileNum;
	}
	public void setMobileNum(long mobileNum) {
		MobileNum=mobileNum;
	}
	
}
