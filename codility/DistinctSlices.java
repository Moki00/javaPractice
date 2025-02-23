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
        int[] lastSeen = new int[M + 1];
        int left = 0; // all elements from left to right are distinct
        int count = 0; // Count of distinct slices

        for (int i = 0; i < n; i++) {
            
            if (lastSeen[A[i]] > left) {
                left = lastSeen[A[i]]; // Move the left pointer to the right of the last seen index
            }
            lastSeen[A[i]] = i + 1; // Update the last seen index of A[i]
            count += (i - left + 1); // Count the number of distinct slices ending at index i
            
            if (count > 1_000_000_000) {
                return 1_000_000_000; // Return early if count exceeds limit
            }

        }

        return count;
    }
}