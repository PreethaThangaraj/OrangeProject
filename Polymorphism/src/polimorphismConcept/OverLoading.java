package polimorphismConcept;
public class OverLoading {
	public void OverLoading(int a,int b,int c) {
		c=a+b;
		c=a-b;
		System.out.println(c);
	}
	void OverLoading(String a,long l) {
		long b = l;
		System.out.println(a+ b);
	}
	private void OverLoading(char c,int a,int b){
		System.out.println(c + a+ b );
}
public OverLoading() {
		// TODO Auto-generated constructor stub
	}
void OverLoading(float d,boolean b) {
	System.out.println(b );
	System.out.println(d);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading ove = new OverLoading();
		ove.OverLoading(20,30,50);
		ove.OverLoading("ANU", 9876543245l);
		ove.OverLoading(25.5f, false);	
		int c =600;
		ove.OverLoading(c, 500,100);
	}
}
