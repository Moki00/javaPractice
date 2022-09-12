package testing;

import java.util.*;

public class testing1 {

	public static void main(String[] args) {

		/*
		 * Complete the 'countMax' function below.
		 *
		 * The function is expected to return a LONG_INTEGER.
		 * The function accepts STRING_ARRAY upRight as parameter.
		 */
		List<String> upRight = new ArrayList<String>();
		upRight.add("2 1");
		upRight.add("4 2");
		upRight.add("1 7");
		System.out.println(upRight);

		// get initial grid
		int length = upRight.size();
		System.out.println(length);
		int highRo = 0;
		int highCo = 0;

		for (int i=0; i<length; i++){

			String x = upRight.get(i);
			String row = x.substring(0,1);
			String col = x.substring(2,3);

			int ro = Integer.parseInt(row);
			int co = Integer.parseInt(col);

			if (ro>highRo){
				highRo=ro;
			}
			if (co>highCo){
				highCo=co;
			}
		}
		System.out.println(highRo);
		System.out.println(highCo);

		// set grid
		int[][] grid = new int[highRo][highCo];

		for (int i=0; i<length; i++){
			for (int j=0; j<length; j++){
				grid[i][j]++;
			}
		}
		System.out.println(grid[0][0]);

		// String b = a.substring(0,1);
		// System.out.println(b);
		// int i = Integer.parseInt(b);
		// System.out.println(i);
	}
}
