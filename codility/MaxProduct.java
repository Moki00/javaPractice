public class MaxProduct {
    public int solution(int[] A) {
        // Sort the array
        java.util.Arrays.sort(A);
        
        // Calculate the product of the 3 largest numbers
        int n = A.length;
        return A[n - 1] * A[n - 2] * A[n - 3];
               
    }
}