public class DistinctSlices {

    /**
     * This method calculates the number of distinct slices in an array A with elements ranging from 0 to M.
     * It uses a sliding window approach to efficiently count distinct slices while ensuring the count does not exceed 1,000,000,000.
     *
     * @param M The maximum value of elements in array A.
     * @param A an array of integers.
     * @return The number of distinct slices or 1,000,000,000 if the count exceeds this limit.
     */
    public int solution(int M, int[] A) {
        int n = A.length;
        // int[] lastSeen = new int[M + 1];
        int left = 0; // Left pointer for the sliding window
        int count = 0; // Count of distinct slices

        // boolean array to track the last seen index of each element
        boolean[] seen = new boolean[M + 1]; // false by default
        for (int i = 0; i < n; i++) {
            while (seen[A[i]]) {
                seen[A[left]] = false; // Mark the leftmost element as not seen
                left++;
            }
            seen[A[i]] = true; // Mark the current element as seen
            count += (i - left + 1); // + distinct slice

            if (count > 1_000_000_000) {
                return 1_000_000_000; // Return early if count exceeds limit
            }

        }

        return count;
    }
}