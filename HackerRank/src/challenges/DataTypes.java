package challenges;

public class DataTypes {

	public static void main(String[] args) {
		

				long x = 99912345;
				System.out.println(x + " can be fitted in:");
				if (x == (byte) x)
					System.out.println("* byte");
				if (x == (short) x)
					System.out.println("* short");
				if (x == (int) x)
					System.out.println("* int");
				if (x == (long) x)
					System.out.println("* long");
			
		}
		
//		Scanner scanned = new Scanner(System.in);
//		int numOfTests = scanned.nextInt();
//		for (int i = 0; i < numOfTests; i++) {
//			try {
//				long x = scanned.nextLong();
//				System.out.println(x + " can be fitted in:");
//				if (x == (byte) x)
//					System.out.println("* byte");
//				if (x == (short) x)
//					System.out.println("* short");
//				if (x == (int) x)
//					System.out.println("* int");
//				if (x == (long) x)
//					System.out.println("* long");
//			} catch (Exception e) {
//				System.out.println(scanned.next() + " can't be fitted anywhere.");
//			}
//
//		}
	

}
