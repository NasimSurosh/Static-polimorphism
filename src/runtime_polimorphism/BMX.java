package runtime_polimorphism;

class Bike{
	void run() {
		System.out.println("running");
	}
}

public class BMX extends Bike{
	@Override
	void run() {
		System.out.println("running 40 km/h");
	}

	public static void main(String[] args) {
		
		Bike bike = new BMX();
		bike.run();
		

	}

}
