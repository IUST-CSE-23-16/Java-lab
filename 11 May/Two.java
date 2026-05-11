class Person {
	String name;
	int age;

	Person(String n, int a) {
		name = n;
		age = a;
	}

	void display() {
		System.out.println("Name: " + name + " Age: " + age);
	}
}

class Employee extends Person {
	int salary;
	
	Employee(String n, int a, int s){
		super(n, a);
		salary = s;
	}
	
	void display() {
		System.out.println("Name: " + name + " Age: " + age + " Salary: " + salary);
	}
}

public class Two {
	public static void main(String[] args) {
		Person p1 = new Person("Azeem", 21);
		Employee e1 = new Employee("Amaan", 22, 40000);

		p1.display();
		e1.display();
	}
}
