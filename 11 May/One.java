class Vehicle {
	void start() {
		System.out.println("Vehicle started");
	}
}

class Car extends Vehicle {
	void start() {
		System.out.println("Car started");
	}
}


public class One {
	public static void main(String[] args) {
		Vehicle myVehicle = new Vehicle();
		myVehicle.start();
		
		Car myCar = new Car();
		myCar.start();
	}
}
