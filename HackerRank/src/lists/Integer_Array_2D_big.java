package lists;

import java.util.ArrayList;
import java.util.List;

public class Integer_Array_2D_big {
	
	/**
	 * Given a square matrix
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
		
//		 * Given a square 4x4 matrix
	List<List<Integer>> List2d_ = new ArrayList<List<Integer>>();
	List<Integer> List0_ = new ArrayList<>(); 
	List<Integer> List1_ = new ArrayList<>(); 
	List<Integer> List2_ = new ArrayList<>(); 
	List<Integer> List3_ = new ArrayList<>(); 

	List0_.add(-1);
	List0_.add(2);
	List0_.add(4);
	List0_.add(4);

	List1_.add(4);
	List1_.add(-8);
	List1_.add(-5);
	List1_.add(6);
	
	List2_.add(10);
	List2_.add(9);
	List2_.add(7);
	List2_.add(-1);

	List3_.add(4);
	List3_.add(8);
	List3_.add(-12);
	List3_.add(1);
	
	List2d_.add(List0_);
	List2d_.add(List1_);
	List2d_.add(List2_);
	List2d_.add(List3_);
		
	System.out.println(diagonalDifference(List2d)+" is the 3x3 matrix diff");
	System.out.println(diagonalDifference(List2d_)+" is the 4x4 matrix diff");
	}
	
	/**
	 * 
	 * @param 2D_INTEGER_ARRAY arr
	 * @return int
	 */
	public static int diagonalDifference(List<List<Integer>> arr) {
		
		// find size of array
		int size = arr.size();

		// cross topLeft to botRight
		int sumTopLeft = 0;
		for (int i = 0; i < size; i++) {
			sumTopLeft+=arr.get(i).get(i);
		}
	    	    
		// cross topLeft to botRight
		int sumTopRight = 0;
		int topRight = size-1;
		for (int i = 0; i < size; i++) {
			sumTopRight+=arr.get(i).get(topRight);
			topRight-=1;
		}
	    
	    // absolute difference
	    int diff = sumTopLeft-sumTopRight;
	    if (diff<0) {
	    	return diff*-1;
		} else {
			return diff;
		}
	}
}
