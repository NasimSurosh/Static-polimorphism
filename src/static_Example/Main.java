package static_Example;

class Counter{
	int count = 0;
	// static int count = 0;
	Counter(){
		count++;
		System.out.println(count);
		
	}
}

public class Main {

	public static void main(String[] args) {
		
		Counter coun = new Counter();
		Counter coun1 = new Counter();
		Counter coun2 = new Counter();
		
		

	}

}
