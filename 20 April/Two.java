import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int number = sc.nextInt();



		if (number > 0)
			System.out.println("Positive");
		else if (number < 0)
			System.out.println("Negative");
		else if (number == 0)
			System.out.println("Zero");
		
		if (number % 2 == 0)
			System.out.println("Even");
		else 
			System.out.println("Odd");
		
		if (number % 5 == 0)
			System.out.println("Is multiple of 5");
		else 
			System.out.println("Is NOT multiple of 5");
		
		if (Math.abs(number >= 100 && number < 1000))
			System.out.println("Is a three digit number");
		else 
			System.out.println("Is a NOT three digit number");
			


	}
}
