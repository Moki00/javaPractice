package strings;

public class AnagramCat {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
        String a="Hello";
        String b="hello";
        
        String A= a.toUpperCase();
        String B= b.toUpperCase();
        
        String x = A.chars()
        	      .sorted()
        	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        	      .toString();

        String y = B.chars()
      	      .sorted()
      	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
      	      .toString();
        
        System.out.println(x);
        System.out.println(y);
        
        if(x.equals(y)){
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
	}
}
