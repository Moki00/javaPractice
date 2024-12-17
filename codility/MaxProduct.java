public class MaxProduct {
    public int solution(int[] A) {
        // Sort the array
        java.util.Arrays.sort(A);
        
        // Calculate the product of the 3 largest numbers
        int n = A.length;
        long product1 = A[n - 1] * A[n - 2] * A[n - 3];
        // Calculate the product of the 2 smallest numbers and the largest number
        long product2 = A[0] * A[1] * A[n - 1];
        // Return the maximum of the two products
        return (int) Math.max(product1, product2);
               
    }
}