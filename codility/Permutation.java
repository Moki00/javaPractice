public class Permutation {
    // Function to check if a given array is a permutation of numbers from 1 to N
    public int isPermutation(int[] A) {
        int N = A.length;
        boolean[] seen = new boolean[N + 1]; // Create a boolean array to track seen numbers

        for (int i = 0; i < N; i++) {
            if (A[i] < 1 || A[i] > N || seen[A[i]]) {
                return 0; // If the number is out of range or already seen, it's not a permutation
            }
            seen[A[i]] = true; // Mark the number as seen
        }

        return 1; // If all numbers from 1 to N are seen exactly once, it's a permutation
    }
}
