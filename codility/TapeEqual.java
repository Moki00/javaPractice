public class TapeEqual {
    
    public int solution(int[] A) {
        // Calculate the total sum of the array
        int totalSum = 0;
        for (int num : A) {
            totalSum += num;
        }

        // Initialize left sum and right sum
        int leftSum = 0;
        int rightSum = totalSum;

        // Iterate through the array to find the point where left and right sums are equal
        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            rightSum -= A[i];

            if (leftSum == rightSum) {
                return i + 1; // Return the index where the tape can be split
            }
        }

        return -1; // If no such point exists, return -1
    }
}
