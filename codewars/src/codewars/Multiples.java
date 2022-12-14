package codewars;

public class Multiples {

	public static void main(String[] args) {

		System.out.println(solution(10));
		System.out.println(solution(11));
		System.out.println(solution(12));

	}
	
	 public static int solution(int number) {
		    int sum=0;
		    
		    for (int i=0; i < number; i++){
		      if (i%3==0 || i%5==0){sum+=i;}
		    }
		    return sum;
		  }

	public static int solution2(int num) {

		int total=0;
		for (int i = 0; i < num; i++) {
			if (i%15==0) {
				total+=i;
			} else if (i%5==0) {
				total+=i;
			} else if (i%3==0) {
				total+=i;
			}  
		}

		return total;
	}

}
