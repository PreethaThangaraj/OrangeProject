package inheritanceConcept;

public class MultilevelInherit extends SingleInheritance{
	private void employeePfNo() {
		long l=5678900045l;
		System.out.println("UAN="+l);
	}
	void employeepromotionDate() {
		System.out.println("01/04/23");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     MultilevelInherit mul=new MultilevelInherit();
		//SingleInheritance j=new SingleInheritance();  //parentclass variable name = new parentclass()
		//j.employeeContact();
		SingleInheritance k=new MultilevelInherit();   //parentclass variable name = new childclass()
        k.employeeContact();
       // MultilevelInherit h=new SingleInheritance();
      //  h.employeeContact();
//      mul.officeName();
//      mul.employeeName();
//      mul.employeeID();
//      mul.employeeDesignation();
//      mul.employeeContact();
//      mul.employeePfNo();
//      mul.employeepromotionDate();
	}
}
