package interview;

public class Generics {
	
	public static void main(String[] args) {
		printArray();
	}

	public static void printArray () {
		Object[] arr = {1, 2, 3, "Hello", "World"};
		for (int i = 0; i < arr.length; i++) {			
			System.out.println(arr[i]);
		}
	}
}
