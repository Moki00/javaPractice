package simple;

public class BasicMath {

	public static void main(String[] args) {
		
		System.out.println(isDivisible(12,4,3));
		
//		System.out.println(basicMath("+", 4, 7)); // 11

	}
	
	public static boolean isDivisible(long n, long x, long y) {
	    return n%x==0 && n%y==0;
	}
	
	public static boolean isDivisible2(long n, long x, long y) {
		if(n%x==0 && n%y==0)
			return true;
		return false;
	}

	public static Integer basicMath(String op, int v1, int v2) {
		
		try {
			if (op.equals("+"))
				return v1+v2;
			else if(op.equals("-"))
				return v1-v2;
			else if(op.equals("*"))
				return v1*v2;
			else
				return v1/v2;
		} catch (Exception e2) {

		}
		return 0;

	}
}
