// ---------------------------------------

class Employee {
	int salary() {
		return 3000;
	}
}

class Manager extends Employee {
	@Override
	int salary() {
		return 5000;
	}
}

class Index {
	public static void main(String[] args) {
		Employee m = new Manager();
		System.out.println("Salary: " + m.salary());
	}
}
// ---------------------------------------
