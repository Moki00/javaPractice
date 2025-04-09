public class MaxSliceSum {
    /**
     * This method calculates the maximum sum of a slice in the given array.
     * A slice is defined as a contiguous subarray.
     *
     * @param A The array of integers.
     * @return The maximum sum of any slice in the array.
     */
    public int solution(int[] A) {

        // start the first element
        int maxSum = A[0];
        int currentSum = A[0];

        for (int i = 1; i < A.length; i++) {

            if (currentSum < 1) {
                currentSum = 0;
            } 

            currentSum += A[i];
            maxSum = Math.max(maxSum, currentSum);

        }

        return maxSum;
    }
}
