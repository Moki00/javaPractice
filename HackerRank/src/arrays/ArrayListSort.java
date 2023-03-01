package arrays;

import java.util.*;

public class ArrayListSort {

	public static void main(String[] args) {
		
		// an example list
		List<Integer> exampleL = new ArrayList<>();
		exampleL.add(1);
		exampleL.add(1);
		exampleL.add(3);
		exampleL.add(2);
		exampleL.add(1);
		exampleL.add(4);
		exampleL.add(4);
		
//		countingSort(exampleL);
		System.out.println(countingSort(exampleL));
			
	}
	
	public static List<Integer> countingSort(List<Integer> arr) {
		
	    // create an array with 100 elements of zeros
	    List<Integer> li= new ArrayList<>();
	    for (int i = 0; i < 100; i++) {
	    	li.add(0);			
		}
	    
	    // count the number of times each value appears
	    for (int i = 0; i < arr.size(); i++) { // look thru arr [1, 1, 3, 2, 1, 4, 4]

	    	System.out.println(i+" is i");
	    	
	    	int liLocation = arr.get(i);
	    	System.out.println(liLocation+ " is liLocation");
	    	
	    	int newValue = li.get(liLocation)+1;
	    	System.out.println(newValue+ " is newValue");
	    	li.set(liLocation, newValue); //  set(index, new value)
	    	
	    	System.out.println(li.get(liLocation)+ " is element at Loc");
		}
	    
	    return li;

	    }
}