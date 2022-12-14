package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Pivot_Index {

	public static void main(String args[]) {
		int[] array = {1,7,3,6,5,6};
		System.out.print(pivotIndex(array));// n-2 because 2 numbers are already printed
	}

	public static int pivotIndex(int[] nums) {
		int pi=0; // pivot index
		int ls=0; // left side
		int rs=0; // right side
		Map<Integer, Integer> lm = new HashMap<Integer, Integer>(); // left map
		Map<Integer, Integer> rm = new HashMap<Integer, Integer>(); // right map

		// right side map
		for(int j=nums.length-1; j>pi; j--){  // right to pivot
			rm.put(j,nums[j]);
			System.out.println("rm is: "+rm);
		}

		// add up rm values; if r = 0
		for (Entry<Integer, Integer> entry : rm.entrySet()) 
			System.out.println(rs+=entry.getValue());
		if (rs==ls){return pi;}

		// left side map
		for(int k=0; k<pi; k++){ // left to pivot
			lm.put(k,nums[k]);
			System.out.println("lm is: "+lm);
		}

		// add up LeftMap values
		for (Entry<Integer, Integer> entry : lm.entrySet()) 
			System.out.println(ls+=entry.getValue());
		if (rs==ls){
			return pi;}

		for (; pi < nums.length; pi++) {
			if (rs==ls){
				return pi;
			} else {
				//	rm.remove(pi+1);
				rs-=nums[pi+1];
				ls+=nums[pi+1];
				pi++;
			}
		}
		//		} else pi++;
		return -1;
	}
}

//for (Entry<Integer, Integer> entry : rm.entrySet()) 
//    System.out.println("Key = " + entry.getKey() +
//                     ", Value = " + entry.getValue());