import java.util.Scanner;

class Two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.err.println("Enter number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter elements: ");
		for (int i = 0; i < n; ++i) {
			// System.out.print("el " + String.format("%02d", i + 1) + ": ");
			System.out.printf("el %02d: ", i+1);
			arr[i] = sc.nextInt();
		}

		System.out.println("------------------------");
		System.out.println("Array in reverse order: ");

		int evenCount = 0, oddCount = 0;

		for (int i = n-1; i >= 0; --i) {
			// printing array
			if (i == n-1) System.out.print("[");
			System.out.print(arr[i]);
			if (i != 0) System.out.print(", ");
			if (i == 0) System.out.print("]\n");

			// even/odd check
			if (arr[i] % 2 == 0) 
				++evenCount;
			else 
				++oddCount;
		}

		System.out.println("Number of even elements: " + evenCount);
		System.out.println("Number of odd elements:  " + oddCount);
	}
}
