package arrays;

import java.util.*;

public class ArrayListQuery {

	public static void main(String[] args) {
		/*
		 * The first line has an integer n
		 * each of the next n lines there will be an integer d
		 * d number of integers on that line
		 * d space-separated integers
		 * integer q = number of queries
		 * Each query will consist of two integers x and y.
		 */
		int n, d, q, i, j, x, y; // declare all integers

//	    Scanner s = new Scanner(System.in);
//	    n = s.nextInt(); // each of the next n lines there will be an integer d
		n = 1;

		// make a grid
		List<List<Integer>> grid = new ArrayList<>();

		// each row in the grid
		for (i = 0; i < n; i++) { // for each n lines

			// make the row
			List<Integer> row = new ArrayList<>();
//			d = s.nextInt(); // d items in a row
			d = 5;

			// each item in a row
			for (j = 0; j < d; j++) { // for each d item
//				row.add(s.nextInt());
			}
			row.add(41); // eclipse-only
			row.add(77); // eclipse-only
			row.add(74); // eclipse-only
			row.add(22); // eclipse-only
			row.add(44); // eclipse-only

			grid.add(row); // add the row to the grid
			// System.out.println("d = "+d);
			// System.out.println("row = "+row);
		}

		 System.out.println("grid = "+grid);

//		q = s.nextInt(); // number of queries
		q = 5;

		// make a query grid
		List<List<Integer>> query = new ArrayList<>();

		// each row in the query grid
		for (i = 0; i < q; i++) { // for each q rows
			
			// make the row
			List<Integer> xy = new ArrayList<>();
			for (j = 0; j < 2; j++) { // for both x and y
//				xy.add(s.nextInt());
				xy.add(i); // eclipse-only,x
			}
			
			query.add(xy); // add the xy pair to the query grid
		}

		// find the x and y locations in the grid
		for (i = 0; i < q; i++) { // for each q rows
			x = query.get(i).get(0);
			y = query.get(i).get(1);
			 System.out.println("x is: "+x);
			 System.out.println("y is: "+y);
			try{
				System.out.println(grid.get(x-1).get(y-1));  // the answers
			}
			catch (Exception e){
				System.out.println("ERROR!");
			}
		}

		// System.out.println(grid.get(query.get(0).get(2)).get(2));  // row 0 = 1st row, item 2 = 3rd item
		 System.out.println("query = "+query);
		// System.out.println("first row in grid = "+grid.get(0));
		// System.out.println("first item in first row in query = "+query.get(0).get(0));
		// System.out.println("item 3 in first row in grid = "+grid.get(0).get(2));  // row 0 = 1st row, item 2 = 3rd item

//		s.close();
	}
}