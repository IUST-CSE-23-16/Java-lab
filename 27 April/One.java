import java.util.Scanner;

class One
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");

		int n = sc.nextInt();
		int[] arr = new int[n];

		int min = 0, max = 0;
		double average = 0;

		System.out.println("Enter elements: ");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

			if (i == 0) {
				min = arr[0];
				max = arr[0];
			}

			if (arr[i] < min) min = arr[i];
			if (arr[i] > max) max = arr[i];

			average += arr[i];
		}
		average /= n;

		System.out.println("Min:      " + min);
		System.out.println("Max:      " + max);
		System.out.println("Average : " + average);
	}
}
