package arrays;

import java.util.*;

public class LeftRotation {

	public static void main(String[] args) {
		// example
		int d = 4;

		List<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

		System.out.println("output: " + rotLeft(a, d));

	}

	public static List<Integer> rotLeft(List<Integer> a, int d) {

		List<Integer> rotated = new ArrayList<Integer>();

		for (int i = d; i < a.size(); i++) {
			rotated.add(a.get(i));
			if (i == a.size() - 1) {
				i = -1;
				continue;
			}
			if (i == d - 1) {
				break;
			}
		}
		return rotated;
	}

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(firstMultipleInput[0]);
//
//        int d = Integer.parseInt(firstMultipleInput[1]);
//
//        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        List<Integer> result = Result.rotLeft(a, d);
//
//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining(" "))
//            + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
}
