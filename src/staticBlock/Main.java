package staticBlock;

public class Main {
	
	final static int NUMBER;
	
	static {    // this will execute before main method
		NUMBER = 10;
		System.out.println(NUMBER);
		System.out.println("Hello from statim block");
		
	}

	public static void main(String[] args) {
		
		System.out.println("Hello from main");

	}

}
