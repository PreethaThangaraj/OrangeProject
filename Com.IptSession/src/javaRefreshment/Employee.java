package javaRefreshment;

import java.util.ArrayList;
import java.util.List;

public class Employee {
		String name;
		String address;
		int age;
		public Employee(String name,String address,int age) {
			this.name=name;
			this.address=address;
			this.age=age;
		}
		
public static void main(String[] args) {
	Employee e = new Employee("JASMINE","CHENNAI",25);
	Employee e1 = new Employee("Preetha","Theni",26);
	Employee e2 = new Employee("Durga","Madurai",25);
	Employee e3 = new Employee("Rincy","Vellor",20);
	Employee e4 = new Employee("Preethi","Avadi",24);
	
	List<Employee>l=new ArrayList<>();
	l.add(e);
	l.add(e1);
	l.add(e3);
	l.add(e2);
	l.add(e4);
	
	for(Employee emp:l) {
		System.out.println(emp);
	}
	
}

@Override
public String toString() {
	return "name=" + name + ", address=" + address + ", age=" + age + "";
}	
}
