public class Four {

	static int[] readArray() {
		System.err.println("Enter number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter elements: ");
		for (int i = 0; i < n; ++i) {
			// System.out.print("el " + String.format("%02d", i + 1) + ": ");
			System.out.printf("el %02d: ", i+1);
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	void merge(int[] arr, int p, int q, int r) {
		int nl = q - p + 1;
		int nr = r - q + 1;

		int arrL[] = new int[nl];
		int arrR[] = new int[nl];

		// fill up arrL and arrR
		for (int i=0; i < nl; i++) {
			
		}
	}

	public static void main(String[] args) {
		int arr1[] = readArray();
		int arr2[] = readArray();
	}
}
