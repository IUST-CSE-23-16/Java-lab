import java.util.Scanner;

class Three {

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

		System.out.println("Enter element to search: ");
		int target = sc.nextInt();
		int targetPosition = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] == target) 
				targetPosition = i;
		}

		if (targetPosition != -1)
			System.out.println("> " + target +" < FOUND at index " + targetPosition);
		else
			System.out.println("> " + target +" < NOT FOUND");
	}
}
