package lists;

public class ListA {
	public static void main(String[] args) {
		{
			int sum =0;
			int i, len; // intilize all integers
			
			int[] n = {1, 2, 2};
			len = n.length;

			for (i = 0; i < len; i++) {
				int squared =n[i]*n[i]; 
				sum+=squared;
			}
			System.out.println(sum);
		}
	}
}