package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddBigSum {

	public static void main(String[] args) {
//		int n = 5;
		List<Long> ar = new ArrayList<Long>(
				Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L));
		
		System.out.println(aVeryBigSum(ar));
	}

	public static long aVeryBigSum(List<Long> ar) {

		long sum = 0;

		for (int i = 0; i < ar.size(); i++) {
			sum += ar.get(i);
		}
		return sum;

	}

//	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		int arCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//		List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Long::parseLong)
//				.collect(toList());
//
//		long result = AddBigSum.aVeryBigSum(ar);
//
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
//	}
}
