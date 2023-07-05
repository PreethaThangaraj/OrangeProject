package partialAbstract;

public class ConfidentialMsg implements EmployeeDetail,Mail{

	@Override
	public void MailID() {
		// TODO Auto-generated method stub
		System.out.println("jas1234@gmail.com");
	}

	@Override
	public void MailPassword() {
		// TODO Auto-generated method stub
		System.out.println("abc@123");
	}

	@Override
	public void systemID() {
		// TODO Auto-generated method stub
	System.out.println("abcd5678");	
	}

	@Override
	public void systemPassword() {
		// TODO Auto-generated method stub
		System.out.println("zzz");
	}
	
public static void main(String[] args) {
	ConfidentialMsg cm = new ConfidentialMsg();
	cm.systemID();
	cm.systemPassword();
	cm.MailID();
	cm.MailPassword();
}
	
}