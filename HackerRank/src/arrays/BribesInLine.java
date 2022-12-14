package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BribesInLine {

	public static void main(String[] args) {

		/*
		 * People are standing in line, ordered 1 to n
		The List<Integer> q is the positions of the people after all bribes.
		Print the minimum number of bribes necessary or
		Print "Too chaotic" if someone has bribed more than 2 people.
		 */

		List<Integer> q = new ArrayList<Integer>(Arrays.asList(2, 1, 5, 3, 4)); // 3
		List<Integer> q2 = new ArrayList<Integer>(Arrays.asList(2, 5, 1, 3, 4)); // Too chaotic
		List<Integer> q3 = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4)); // expect 7

		minimumBribes(q3); // change this to see in console
	}

	public static void minimumBribes(List<Integer> q) {

		int numOfPeople = q.size(); // number of people in the queue = 8
		int maxBribes = 2; // fixed limit
		int allBribes = 0; // how many bribes, starting at 0

		for (int i = 1; i <= numOfPeople; i++) {

			int personNum = q.get(i-1); // the person in line

			if(personNum!=i && personNum-i>maxBribes) {
				System.out.println("Too chaotic");
				return; // ends all here if bribed too much
			}
		}

		int lastLocation = q.size()-1; // the last location for people in the queue = 7

		for (int i = lastLocation; i > 0; i--) { // from end to start, right to left, 7 to 1

			int person = q.get(i);
			int location = i+1;

			System.out.println("#"+person+ " is located in the '"+i+"' location in the line");

			if(person!=location) {

				int bribe = 1;
				for(int x=1; x<numOfPeople; x++){

					int move = q.get(i-x); // far right moving left by one = q.get(7-1) = 4
					System.out.println(move+" will have to move");

					if(location!=move) {
						bribe++;
					} else{
						break;
					}
				}
				for(int j=bribe; j>0; j--){ // 
					int temp = q.get(i-j);
					q.set(i-j,q.get(i-j+1));
					q.set(i-j+1,temp);
					allBribes++;
				}
			}
		}

		//0-7 locations for 1-8 ..1, 2, 5, 3, 7, 8, 6, 4; expect 7 bribes
		System.out.println(allBribes+" total times bribed");
	}
}
