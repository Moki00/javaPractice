package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lonelyIntMap {

	public static void main(String[] args) {
		
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
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for (Integer in : a) {
			
			if(map.containsKey(in)) {
				map.put(in, false);
			} else {
				map.put(in, true);
			}
		}
		
//		System.out.println(map);

		for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Boolean val = entry.getValue();
			
			if(val==true) {
				return key;
			}
		}
		
		return 0;
		
	    }
}