public class DistinctSlices {
    public int solution(int M, int[] A) {
        int n = A.length;
        int[] lastSeen = new int[M + 1];
        int start = 0;
        int count = 0;

        for (int end = 0; end < n; end++) {
            if (lastSeen[A[end]] > start) {
                start = lastSeen[A[end]];
            }
            lastSeen[A[end]] = end + 1; // Store the next position after the current index
            count += (end - start + 1);
            if (count > 1000000000) {
                return 1000000000; // Return early if count exceeds limit
            }
        }

        return count;
    }
}