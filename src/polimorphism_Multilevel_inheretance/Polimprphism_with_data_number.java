package polimorphism_Multilevel_inheretance;

class Vehicle{
	int speedLimit = 90;
}

public class Polimprphism_with_data_number extends Vehicle{
	
	int speedLimit = 100;

	public static void main(String[] args) {
		
		Vehicle vehicle = new Polimprphism_with_data_number();
		
		System.out.println(vehicle.speedLimit);  // this not considered polymorphism

	}

}
