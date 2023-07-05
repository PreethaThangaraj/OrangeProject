package partialAbstract;
public class EmployeeOffice extends Office{
void customerAttendance() {
	System.out.println("present");
}
public void  employeeCode() {
	System.out.println("HDFC");
}
public void employeeid() {
	System.out.println("67543");
}
void employeePasword() {
	System.out.println("nila");
}
@Override
void employeeNum(long l) {
	System.out.println(l);
}
@Override
public void address() {
	System.out.println("CHENNAI");
}
public static void main(String[] args) {
	EmployeeOffice e = new EmployeeOffice();
	e.companyName();
	e.employeeName();
	e.customerAttendance();
	e.employeeCode();
	e.employeeid();
	e.employeeNum(9876543213l);
	e.employeePasword();
   
}
}