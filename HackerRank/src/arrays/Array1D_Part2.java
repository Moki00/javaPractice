package arrays;

public class Array1D_Part2 {

	 @SuppressWarnings("unused")
	public static void main(String[] args) {
		 /*
		 We're standing at index 0 of an n-element array named game. From some index i (where ), you can perform one of the following moves:

		 Move Backward: If cell i+1 exists and contains a 0, you can walk back to cell i-1.
		 Move Forward:
		 If cell i+1 contains a zero, you can walk to cell i+1.
		 If cell i+leap contains a zero, you can jump to cell i+leap.
		 If you're standing in cell n-1 or the value of (i+leap>=n), you can walk or jump off the end of the array and win the game.
		 In other words, you can move from index i to index (i+1), (i-1), or (i+leap) as long as the destination index is a cell containing a 0. If the destination index is greater than n-1, you win the game.

		 --Function Description--
		 Complete the canWin function in the editor below.
		 canWin has the following parameters:
		 int leap: the size of the leap
		 int game[n]: the array to traverse

		 Returns a boolean: true if the game can be won, otherwise false

		 --Input Format--
		 The first line contains an integer, q, denoting the number of queries (function calls).
		 The 2q subsequent lines describe each query over two lines:
		 1. The first line contains two space-separated integers describing the respective values of 'n' and 'leap'.
		 2. The second line contains  space-separated binary integers (zeroes and ones) describing the respective values of game0, game1...game(n-1).
		 */

		 int q, n = 0, leap;
//		 Scanner s = new Scanner(System.in);
//		 q = s.nextInt();
		 q=4;
		 System.out.println("q = "+q);

		 for (int i = 0; i < q; i++) {
//			String string = args[i];
			n=5;
		}
		 int game[] = new int[n];
		 boolean win = false;

		     }
		 }