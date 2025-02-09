import java.util.*;

public class Main {
    // This is a simple Java program that prints "Hello world!" to the console.
    public static void main(String[] args) {
        
        // Example usage of DistinctSlices
        DistinctSlices distinctSlices = new DistinctSlices();
        int M = 6; // Maximum value in array A
        int[] B = {3, 4, 5, 5, 2};
        int distinctCount = distinctSlices.solution(M, B);
        System.out.println("Number of distinct slices in array " + Arrays.toString(B) + ": " + distinctCount);


    }
    
}
