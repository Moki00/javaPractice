package interview;

import java.util.*;

/*
 * Complete the 'jumpingOnClouds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY c as parameter.
 */

public class JumpingClouds {

	static int n = 7;

	public static void main(String[] args) {

		// 0's are good, must avoid 1's
//		List<Integer> c = Arrays.asList(0, 0, 1, 0, 0, 1, 0); // 4 jumps
		List<Integer> c = Arrays.asList(0, 1, 0, 0, 0, 1, 0); // 3 jumps

		System.out.println(jumpingOnClouds(c));
	}

	public static int jumpingOnClouds(List<Integer> c) {

		// fixing the length of JumpCloudArray as the c List
		int n = c.size();
		int[] JumpCloudArray = new int[n];

		// look though all clouds in List 'c'
		for (int i = 0; i < n; i++) {

			// jump on cloud 9
			JumpCloudArray[0] = 9;

			// skip if this cloud is jumped over
			if (i != 0 && JumpCloudArray[i] == 5) {
				continue;
			}

			// end the jumps at the end of the List
			if (i == n - 1) {
				JumpCloudArray[i] = 9;
				break;
			}

			// end the jumps at the end of the List
			if (i == n - 2) {
				JumpCloudArray[i] = 9;
				JumpCloudArray[i + 1] = 9;
				break;
			}

			// if the second cloud is good 0, then jump on it as cloud 9
			// else the next cloud must be jumped on as cloud 9
			// the cloud jumped over is labeled as 5
			if (c.get(i + 2) == 0) {
				JumpCloudArray[i + 2] = 9;
				JumpCloudArray[i + 1] = 5;
				continue;
			} else {
				JumpCloudArray[i + 1] = 9;
			}
		}

		int cloud9 = 0;
		// add up all the cloud 9's that we jumped on in JumpCloudArray
		for (int i = 0; i < n; i++) {
			if (JumpCloudArray[i] == 9) {
				cloud9++;
			}
		}

		// jumps are all cloud9's after the start
		int jumps = cloud9 - 1;

		return jumps;

	}

}

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        int result = Result.jumpingOnClouds(c);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
