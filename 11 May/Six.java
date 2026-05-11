class Animal {
	void makeSound() {
		System.out.println("animal making sound...");
	}
}

class Mammal extends Animal {
	void giveBrith() {
		System.out.println("Giving birth...");
	}
}

class Dog extends Mammal {
	void makeSound() {
		System.out.println("Woof!");
	}
}

public class Six {
	public static void main(String[] args) {
		Animal a = new Animal();
		Mammal m = new Mammal();
		Dog b = new Dog();

		a.makeSound();

		m.makeSound();
		m.giveBrith();

		b.makeSound();
		b.giveBrith();
	}
}
