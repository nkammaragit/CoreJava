package abstraction;

public abstract class Animal {
	
//Abstact method with no body
	abstract void makeSound();
	
	abstract void hunting();
	
// Concrete or Regular method
	public void eat() {
		System.out.println("This animal is eating");
	}

}
