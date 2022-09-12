package strings;

public class palindrome {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//        String str=sc.next();
        String str="java";
        
        StringBuilder builder = new StringBuilder();

        char[] arr = str.toCharArray();
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[arr.length - 1 - i]);
        }

        String newString = builder.toString().trim();
        
        System.out.println(str); // java
        System.out.println(builder);
        
        if(newString.equals(str)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}
}
