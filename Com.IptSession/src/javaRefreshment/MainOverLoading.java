package javaRefreshment;

public class MainOverLoading {

	public static void main(String[] args) {
		main(7);
		main("abc");

	}
static public void main(int args) {
	System.out.println("int overloaded");
}
public static void main(String args) {
	System.out.println("String overloaded");
}

}
