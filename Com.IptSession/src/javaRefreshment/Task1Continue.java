package javaRefreshment;

public class Task1Continue extends TaskAbstract{
public Task1Continue() {
		super("White");	
	}
	static {
		System.out.println("Black");
	}
	//Instance Block
	{
		System.out.println("Yellow");
	}

	
	public static void main(String[] args) {
		TaskAbstract a = new Task1Continue();  
	}

}
