package challenges;

public class IntToString {

	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
		int n = 5;

		String s1 = "" + n;
		String s2 = Integer.toString(n);

		if (s1.equals(s2)) {
			System.out.println("Good job");
		} else {
			System.out.println("Wrong answer");
		}

	}

}

//
//System.out.println(s1);
//System.out.println(s2);