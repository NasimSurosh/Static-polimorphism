package runtime_polimorphism;

public class A {

}

class B extends A{
	A a = new B();   // this is part of runtime polimorphism (upcasting)
}
