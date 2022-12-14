package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class new111 {

	public static void main(String[] args) {
		
		// L is the list
		List<Integer> L = new ArrayList<>();

		L.add(1);
		L.add(0);
		L.add(1);
		L.add(0);
		L.add(12);
		
		System.out.println(lonelyinteger(L));

		    

		}
	
	public static int lonelyinteger(List<Integer> a) {
		
		if(a.isEmpty()) {
			return 0;
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (Integer in : a) {
			
			if(map.containsKey(in)) {
				return in;
			}
			map.put(in, in);
		}
		
		return 0;
	    // Write your code here

	    }
}