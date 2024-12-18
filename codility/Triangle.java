public class Triangle {
    
    public int solution(int[] A) {
        // Sort the array
        java.util.Arrays.sort(A);
        
        // Check for a valid triangle
        for (int i = 0; i < A.length - 2; i++) {
            if (A[i] + A[i + 1] > A[i + 2]) {
                return 1; // Valid triangle found
            }
        }
        
        return 0; // No valid triangle found
    }
}
