package arrays;

import java.util.ArrayList;
import java.util.List;

public class Array2D {

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

//		 get initial grid
		int length = upRight.size(); // 3
		int highRo = 0; // 4 rows
		int highCo = 0; // 7 columns

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
		//		System.out.println(highRo); // 4 rows
		//		System.out.println(highCo); // 7 columns

		// set grid
		int[][] grid = new int[highRo][highCo];
//				System.out.println(grid[3][6]); // empty

		// fill out the grid
		for (int i=0; i<length; i++){

			String x = upRight.get(i);
			String row = x.substring(0,1);
			String col = x.substring(2,3);

			int ro = Integer.parseInt(row);
			int co = Integer.parseInt(col);

			// for each box in the grid, add 1 there
			for (int r=0; r<ro; r++){
				for (int c=0; c<co; c++){
					grid[r][c]++;
//					System.out.println(grid[r][c]);
				}
			}
			System.out.println(grid[0][0]+" first block in grid");
		}
		System.out.println(grid[0][0]+" first block in grid");
		
		//		System.out.println(grid[0][0]);

		// String b = a.substring(0,1);
		// System.out.println(b);
		// int i = Integer.parseInt(b);
		// System.out.println(i);
	}
}
