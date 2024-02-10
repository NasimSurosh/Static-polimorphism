package compiletime_polimorphism;

class Calculate{
	static int Multiply(int a, int b) {
		return a*b;
	}
	static double Multiply(double a, double b) {
		return a*b;
	}
}

public class Compiletime_polimorphism {

	public static void main(String[] args) {
		
		System.out.println(Calculate.Multiply(4, 6));
		System.out.println(Calculate.Multiply(4.3, 7.8));

	}

}
