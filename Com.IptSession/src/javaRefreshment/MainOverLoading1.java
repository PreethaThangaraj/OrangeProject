package javaRefreshment;

public class MainOverLoading1 {

		public static void main(String[] args) {
			main(new int[] {1,2,3,4});

		}
	static public void main(int[] args) {
		System.out.println("int overloaded");
	}
	public static void main(String args) {
		System.out.println("String overloaded");
	}
	}

