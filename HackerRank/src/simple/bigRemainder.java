package simple;

public class bigRemainder {

	public static void main(String[] args) {
		System.out.println(century(89)); // 1 for first century
		System.out.println(century(1601)); // 17 for 17th century
		System.out.println(century(1705)); // 18 for 18th century
		System.out.println(century(1900)); // 19 for 19th century
		System.out.println(century(2000)); // 20 for 20th century
	}

	public static int centuryBest(int number) {
		
		int century = number/100;
		
		if(number%100!=0) {
			century++;
		}
		return century;
	}

	public static int century(int number) {
		
		   return Math.round((number + 99) / 100);
	}

	
}
