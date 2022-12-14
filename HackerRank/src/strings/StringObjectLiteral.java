package strings;

public class StringObjectLiteral {

	public static void main(String[] args) {
		String literalA = "testing";
		String literalB = "testing";
		String objectA = new String("testing");

		// true
		System.out.println(
				literalA == literalB && 
				literalA.equals(literalB) && 
				literalA != objectA && 
				literalA.equals(objectA));
	}
}
