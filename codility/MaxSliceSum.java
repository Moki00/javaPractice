public class MaxSliceSum {
    /**
     * This method calculates the maximum sum of a slice in the given array.
     * A slice is defined as a contiguous subarray.
     *
     * @param A The array of integers.
     * @return The maximum sum of any slice in the array.
     */
    public int solution(int[] A) {
        int n = A.length;
        if (n == 0) return 0;

        int maxSum = A[0];
        int currentSum = Math.max(A[0], 0); // Start with the first element or 0

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(A[i], currentSum + A[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
