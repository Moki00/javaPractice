package lists;

import java.util.ArrayList;
import java.util.List;

public class Integer_Array_2D {
	
	/**
	 * Given a square 3x3 matrix
	 * calculate the absolute difference between the sums of its diagonals
	 */
	public static void main(String[] args) {

//			 * Given a square 3x3 matrix
		List<List<Integer>> List2d = new ArrayList<List<Integer>>();
		List<Integer> List0 = new ArrayList<>(); 
		List<Integer> List1 = new ArrayList<>(); 
		List<Integer> List2 = new ArrayList<>(); 

		List0.add(11);
		List0.add(2);
		List0.add(4);

		List1.add(4);
		List1.add(5);
		List1.add(6);
		
		List2.add(10);
		List2.add(8);
		List2.add(-12);
		
		List2d.add(List0);
		List2d.add(List1);
		List2d.add(List2);
	}
			
	/**
	 * 
	 * @param 2D_INTEGER_ARRAY arr
	 * @return int
	 */
	public static int diagonalDifference(List<List<Integer>> arr) {
	    
		int topLef = arr.get(0).get(0);
		int center = arr.get(1).get(1);
		int botRig = arr.get(2).get(2);
		int topRig = arr.get(0).get(2);
		int botLft = arr.get(2).get(0);
	    
		// sum the two diagnals
	    int sum1 = topLef+center+botRig;
	    int sum2 = topRig+center+botLft;
	    
	    // absolute difference
	    int diff = sum1-sum2;
	    if (diff<0) {
	    	return diff*-1;
		} else {
			return diff;
		}
	}
}
