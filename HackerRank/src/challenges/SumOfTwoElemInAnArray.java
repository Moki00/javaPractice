package challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwoElemInAnArray {

	public static void main(String[] args) {

		int[] ar = {99, 5, 1000004, 100005, 888, 999, 123, 55, 22, 5};
		
		int targe=10;
		
		System.out.println(Arrays.toString(twoSum(ar, targe)));
	}
	
	public static int[] twoSum(int[] nums, int target) {
		
        Map<Integer, Integer> map = new HashMap<>(); // init an empty map
        
        for (int i = 0; i < nums.length; i++) { // for loop nums array
        	
            map.put(nums[i], i); // inserts a k,v element in the map for each nums elem: [3,0],[10000002,1]...k,v
            System.out.println(map);
        }
//        [5=1] Gets replaced by [5=9]
        
        int[] output = {111,222};
          
        for (int i = 0; i < nums.length; i++) {
            int newKey = target - nums[i];

            if (map.containsKey(newKey)) {
            	output[0]=i; // 1
            	output[1]=map.get(newKey); // nums[9]=5
                return output;
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }

	public static int[] twoSum2(int[] nums, int target) {

        int[] output= {8,123456789};

        for (int i = 0; i < nums.length; i++) {
        	
            for (int j = 0; j < nums.length; j++) {
            	
            	if(i==j) {
            		continue;
            	}
            	
            	if(nums[i]+nums[j]==target){
                    output[0]=i;
                    output[1]=j;
                    break;
                }
            }
		}
        return output;
    }
}