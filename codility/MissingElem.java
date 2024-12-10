public class MissingElem{
    public int solution(int[] A) {
        // If the array is empty, the missing element is 1
        if (A.length == 0) {
            return 1;
        }
        
        // Calculate the expected sum of the first N natural numbers
        long n = A.length + 1; // within the range [0..100,000], +1 for the missing one
        long expectedSum = n * (n + 1) / 2;
        
        // Calculate the actual sum of the elements in the array
        long actualSum = 0;
        for (int num : A) {
            actualSum += num;
        }

        int missingElement = 0;
        missingElement = (int) (expectedSum - actualSum);
        
        // The missing element is the difference between expected and actual sums
        return missingElement;
    }
}