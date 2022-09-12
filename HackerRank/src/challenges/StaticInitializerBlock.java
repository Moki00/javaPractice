package challenges;

import java.util.Scanner;

public class StaticInitializerBlock {

	/**
	 * A static initialization block is a normal block of code enclosed in braces ,
	 * { }, and preceded by the static keyword
	 * 
	 */

	static Scanner input = new Scanner(System.in);
	static boolean positive = true;
	static int B = input.nextInt();
	static int H = input.nextInt();

	static {
		try {
			if (B <= 0 || H <= 0) {
				positive = false;
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		if(positive) {
			int area=B*H;
			System.out.println(area);
		}
	}

}
