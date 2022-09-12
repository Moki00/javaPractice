package arrays;

import java.util.*;

public class HourGlass2D {

	public static void main(String[] args) {

		// created main List "arr"
		List<List<Integer>> arr = new ArrayList<>();

		// created each row in arr
		ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 0, 0));
		ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(4, 1, 6, 1, 0, 0));
		ArrayList<Integer> row3 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 0, 0));
		ArrayList<Integer> row4 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 6, 0));
		ArrayList<Integer> row5 = new ArrayList<Integer>(Arrays.asList(0, 0, 1, 0, 0, 0));
		ArrayList<Integer> row6 = new ArrayList<Integer>(Arrays.asList(0, 1, 0, 0, 0, 0));

		// added the rows to arr
		arr.add(row1);
		arr.add(row2);
		arr.add(row3);
		arr.add(row4);
		arr.add(row5);
		arr.add(row6);

		// return the maximum hourglass sum

//		System.out.println("whole array List: " + arr);
		System.out.println("hourglassSum function: " + hourglassSum(arr));

	}

	public static int hourglassSum(List<List<Integer>> arr) {

		int maxValue = -63;
		int sum;

		// start on top 0 row & left 0 column
		for (int row = 0; row < arr.size() - 2; row++) {

			// columns
			for (int column = 0; column < arr.size() - 2; column++) {

				sum = 0;

				// add up all 7 positions of the hourglass
				sum = arr.get(row).get(column) + arr.get(row).get(column + 1) + arr.get(row).get(column + 2)
						+ arr.get(row + 1).get(column + 1) + arr.get(row + 2).get(column)
						+ arr.get(row + 2).get(column + 1) + arr.get(row + 2).get(column + 2);

				// make this hourglass the greatest if so
				if (sum > maxValue) {
					maxValue = sum;
				}
			} // end columns
		} // end hourglass
		return maxValue;
	}

	public static int hourglassSum2(List<List<Integer>> arr) {
//			Scanner in = new Scanner(System.in);
		int matrix[][] = new int[6][6];
		// Read in:

		int maxSum = -64; // Because the minimum it could be is -9*7 = -63
		int startCol = 0;

		// Each iteration of the outer loop is one hour glass:
		for (int row = 0; row <= 3; row++) {
			int sum = 0; // Initialize this specific hourglass' sum
			for (int col = startCol; col < startCol + 3; col++) {
				sum += matrix[row][col]; // Gets current index that col and row are on
				if (col == startCol) { // Only doing it if it's on the startCol ensures we only add middle piece
										// once
					sum += matrix[row + 1][startCol + 1];
				}
				sum += matrix[row + 2][col]; // Gets the corresponding index in the bottom row
			}
			startCol = (startCol < 3) ? startCol + 1 : 0; // If there is space for another hourglass in this row,
															// goto // the next Col
			if (startCol != 0) { // If there is space for another hourglass in this row, continue in the same row
				row--; // You need to decrement in order to do this bc for loop will increment
			}
			if (sum > maxSum) {
				maxSum = sum;
			} // keeps track of what the maximum sum is so we can print it at the end
		}

		System.out.println(maxSum);
		return maxSum;

	}

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        List<List<Integer>> arr = new ArrayList<>();
//
//        IntStream.range(0, 6).forEach(i -> {
//            try {
//                arr.add(
//                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                        .map(Integer::parseInt)
//                        .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        int result = Result.hourglassSum(arr);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}

}
