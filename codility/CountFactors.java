public class CountFactors {
    public static int solution(int N) {
        int count = 0;
        // Loop from 1 to the square root of N
        for (int i = 1; i <= Math.sqrt(N); i++) {
            // If i is a factor of N
            if (N % i == 0) {
                count++; // Count the factor
                if (i != N / i) {
                    count++; // Count the corresponding factor
                }
            }
        }
        return count;
    }
}
