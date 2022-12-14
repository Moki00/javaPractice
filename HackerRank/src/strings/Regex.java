package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		String name3 = "ThisIsOverThirtyCharacters123456";
		String name = "a2345678";

		//		Scanner scan = new Scanner(System.in);
		//        int n = scan.nextInt();
		//        String name="";

		//        for(int i=0; i<n; i++){
		//            
		//            try {
		//                name = scan.next();
		//            } catch (Exception e) {
		//                System.out.println("Invalid");
		//            }


		// change name to char array for length
		char[] c= new char[name.length()];

		try {
			c=name.toCharArray();
		} catch (Exception e) {
			System.out.println("Invalid");
		}

		if(c.length<8){
			System.out.println("Invalid");
//			continue;
		}
		if (c.length>30){
			System.out.println("Invalid");
//			continue;
		}

		if(name.indexOf('@')>0){
			System.out.println("Invalid");
//			continue;
		}

		if(name.indexOf('!')>0){
			System.out.println("Invalid");
//			continue;
		}

		char[] symbols= new char[5];
		symbols[0] = '!';  
		symbols[1] = '@';  
		symbols[2] = '#';  
		symbols[3] = '$';  
		symbols[4] = '%';  

		for(int j=0; j<5; j++){
			if(name.indexOf(symbols[j])>0){
				System.out.println("Invalid");
				continue;
			}
			continue;
		}

		// regex for characters
//		Pattern p = Pattern.compile("^[A-Za-z][A-Za-z0-9_]{7,29}$");
		Pattern p = Pattern.compile("^[A-Za-z]\\w{7,29}$");
		Matcher m = p.matcher(name);

		boolean matchFound = m.matches();
		if(matchFound){
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

	}
}
