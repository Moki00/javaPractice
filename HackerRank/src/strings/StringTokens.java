package strings;

public class StringTokens {

	public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        scan.close();
		
		String s = "   ";
		
		String[] arr = s.trim().split("\\s*[^a-zA-Z]+\\s*");
		
		s = s.trim();
		
		System.out.println(s);
		if(s.length()==0) {
			System.out.println(0);
		} else {
		System.out.println(arr.length);
		for (String a : arr)
			System.out.println(a);
		}
		
    }

}
