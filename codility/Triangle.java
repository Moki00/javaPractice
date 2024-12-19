public class Triangle {
    
    public int solution(int[] A) {

        if(A.length < 3) {
            return 0; // Not enough sides to form a triangle
        }

        // Sort the array
        java.util.Arrays.sort(A);
        
        // Check for a valid triangle
        for (int i = 0; i < A.length - 2; i++) {
            if ((long)A[i] + (long)A[i + 1] > (long)A[i + 2]) {
                return 1; // Valid triangle found
            }
        }
        
        return 0; // No valid triangle found
    }
}
