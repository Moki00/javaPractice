package arrays;

import java.util.*;

public class ListNames {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		List<String> n = new ArrayList<>();
		n.add("ace");
		n.add("superman");
		n.add("bee");
		
		System.out.println("all names: "+n);
		System.out.println("answers: "+ posChange(n));

	}

	public static List<String> posChange(List<String> nList){

		List<String> yList = new ArrayList<>();
		boolean change = false;
		String answer = "NO";
		
		// loop all names in the nList
		for(String name:nList) {
			if(name.charAt(0)=='a') {
				answer = "NO";
				yList.add(answer);
				continue;
			}
			System.out.println("Name: "+name);
			
			char charry[]= name.toCharArray();
			
			for(int i=1; i<charry.length; i++) {
				
				System.out.println(charry[i]+" is: "+(int)charry[i]);
				
				if((int)charry[0] < (int)charry[i]) {
					System.out.println("less");
	                change = false;
	            } else {
	               change = true;
	               break;
	            }
	        }	        

	        if(change){
	        	yList.add("YES");
	        } else {
	        	yList.add("NO");
	        }
	    }		

		return yList;

	}
}
