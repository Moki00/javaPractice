public class TapeEqual {
    
    public int minimalDifference(int[] A) {
        // Calculate the total sum of the array
        int totalSum = 0;
        for (int num : A) {
            totalSum += num;
        }

        // Initialize left sum and right sum
        int leftSum = 0;
        int rightSum = totalSum;
        int diff = Integer.MAX_VALUE;

        // Iterate through the array to find the point where left and right sums are closest
        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            rightSum -= A[i];

            if (leftSum == rightSum) {
                return 0; // Return the index where the tape can be split
            }
            int currentDiff = Math.abs(leftSum - rightSum);
            if (currentDiff < diff) {
                diff = currentDiff;
            }
        }

        return diff;
    }
}
