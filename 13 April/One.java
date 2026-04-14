import java.util.Scanner;

public class One 
{
	public static void main(String args[])
	{
		int x = 0, y = 0;
		System.out.println("Enter two numbers (whitespace separated): ");
		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		y = sc.nextInt();

		System.err.println("Addition       of " + x + " & " + y + " is : " + (x + y));
		System.err.println("Multiplication of " + x + " & " + y + " is : " + (x * y));
		System.err.println("Subtraction    of " + x + " & " + y + " is : " + (x - y));
		System.err.println("Division       of " + x + " & " + y + " is : " + (x / y));
		System.err.println("Remainder      of " + x + " & " + y + " is : " + (x % y));

		sc.close();
	}
}
