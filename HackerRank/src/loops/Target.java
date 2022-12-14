package loops;

import java.util.Arrays;

public class Target {

	public static void main(String[] args) {

		int[] numArray= {1,2,3,4,5};

		System.out.println(Arrays.toString(runningSum(numArray)));
	}

	public static int[] runningSum(int[] nums) {
		int[] s = new int[nums.length];
		int sum=0;
		for(int i=0; i<nums.length; i++){
			s[i]=nums[i]+sum;
			sum=s[i];
		}
		return s;
	}

}
