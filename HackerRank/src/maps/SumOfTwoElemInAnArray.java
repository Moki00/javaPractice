/**
 * 
 */
package maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Moki_21_10
 *
 */
public class SumOfTwoElemInAnArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] numArray= {999, 2, 55, 7, 109876, 555};

		int target = 9;
		
		System.out.println(Arrays.toString(twoSum(numArray, target)));
	}

	private static int[] twoSum(int[] n, int tar) {
		
		int[] out = new int[2]; // init output array of 2 elem
		Map<Integer, Integer> m = new HashMap<Integer, Integer>(); // init map

		for (int i = 0; i < n.length; i++) {
			m.put(n[i], i); // fill map with 999=0, 2=1, 55=2...
			System.out.println(m);
		}
				
		for (int i = 0; i < n.length; i++) {
		
			int key=tar-n[i];
					
			if(m.containsKey(key)) {
				out[0]=i;
				out[1]=m.get(key);
				return out;
			}
		}	
		return null;
	}
	
	

}
