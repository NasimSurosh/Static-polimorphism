package assignmrnt;



public class ShapeCalculate {
	

	public static void main(String[] args) {
		
		
		
		double[] shape = new double[3];
		shape[0] = Rectangle.rectingle(5, 6);
		shape[1] = Circle.circle(7);
		shape[2] = Triangle.triangle(6, 9);
		
		System.out.println("the area of rectingle is "+shape[0]);
		System.out.println("the area of circle is "+shape[1]);
		System.out.println("the area of triangle is "+shape[2]);
		System.out.println();
		
		for(double shape1: shape) {
			System.out.println("The area of shapes: " +shape1);
		}
		
		
	}

}
