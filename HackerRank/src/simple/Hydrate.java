package simple;

public class Hydrate {

	public static void main(String[] args) { 
		System.out.println(Liters(2));  // be 1 liter in 2 hours
		System.out.println(Liters(0.97)); // should be zero since less than an hour
		System.out.println(Liters(14.64)); // be 7 liters in 14.6 hours
	}

	public static int Liters(double time) {
		
		
		return (int) (time/2);

	}
}
