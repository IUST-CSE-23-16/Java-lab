import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.err.println("Enter limit: ");
		int limit = sc.nextInt();
		
		System.err.println("Enter " + limit + " digit number");

		String inputRaw = sc.next();
		char input[] = inputRaw.toCharArray();


		// check if input lenght is greater than 5
		if (inputRaw.length() > limit) {
			throw new Error("Respect the limit");
		}

		// int input = Integer.parseInt(input)
		int sumOfEvenPositions = 0;
		int sumOfOddPositions = 0;

		for (int i = 0; i < limit; i++) {
			if (i % 2 == 0)
				sumOfEvenPositions += input[i] - '0';
			else 
				sumOfOddPositions += input[i] - '0';
		}

		System.err.println("Sum at even positions: " + sumOfEvenPositions);
		System.err.println("Sum at odd positions:  " + sumOfOddPositions);

	}
}
