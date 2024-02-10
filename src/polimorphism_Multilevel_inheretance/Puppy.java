package polimorphism_Multilevel_inheretance;

class Animal{
	void eat() {
		System.out.println("Animal eating...");
	}
}
class Dog extends Animal{
	@Override
	void eat() {
		System.out.println("Animal eating");
	}
}

public class Puppy extends Dog{

	public static void main(String[] args) {
		
		Animal animal = new Puppy();
		animal.eat();

	}

}
