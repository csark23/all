package test2;

abstract class animal{
	void legs() {
		System.out.println("All animals have 4 legs");
	}
	abstract void sound();
	abstract void eat();
}

class Dog extends animal {
	void sound() {
		System.out.println("Bow bow...");
	}
	void eat() {
		System.out.println("Meat eating");
	}
}
class Cow extends animal {
	void sound() {
		System.out.println("hum....");
	}
	void eat() {
		System.out.println("grass eating");
	}
}
public class Test {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		Cow c=new Cow();
		animal a = new Cow();	// reference of an abstract class = object of an sub class
		
		d.legs();
		d.sound();
		d.eat();
		
		c.legs();
		c.sound();
		c.eat();
		
		a.eat();
	}

}
