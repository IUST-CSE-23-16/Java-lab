import java.util.Scanner;

class Index {
	public static void main(String args[]) {
		int x, y, sum = 0;
		System.out.println("Enter two numbers");
		Scanner S = new Scanner(System.in);

		x = S.nextInt();
		y = S.nextInt();

		sum = x + y;

		System.out.println("Sum is: " + sum);

		S.close();
	}
}
