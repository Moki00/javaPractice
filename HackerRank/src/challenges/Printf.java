package challenges;



public class Printf {

	public static void main(String[] args) {

		System.out.println("================================");
		for (int i = 0; i < 2; i++) {
			String s1 = "java";
			int x = 7;
			System.out.printf("%-15s%03d%n", s1, x);  // - is left justified up to 15 's' spaces, % then, 0's before upto 3 digits, 'n' new line
			
			System.out.printf("Formatted with precison: PI = %.9f\n", Math.PI);
			
//			int whiteSpaces = 15 - s1.length();
//			if (x >= 0 && x < 10) {
//				System.out.printf(s1 + "%"+whiteSpaces+"s" + "00"+ x);
//			}
//			System.out.println(s1 + "               " + x);
		}
		System.out.println("================================");

	}

}
//System.out.format("[%13s]%n", "");  // prints "[             ]" (13 spaces)
//System.out.format("[%1$3s]%n", ""); // prints "[   ]" (3 spaces)