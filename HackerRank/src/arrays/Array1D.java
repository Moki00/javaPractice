package arrays;

public class Array1D {

	public static void main(String[] args) {
		//		 Scanner scan = new Scanner(System.in);
		//	        int n = scan.nextInt();

		int n = 5;
		int[] arr = {10,20,30,40,50};

		int a[] = new int[5];
		for (int i = 0; i < n; i++) {
			a[i]=arr[i];
		}

		//	        scan.close();

		// Prints each sequential element in array a
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
