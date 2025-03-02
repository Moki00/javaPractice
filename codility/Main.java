import java.util.*;

public class Main {
    // This is a simple Java program that prints "Hello world!" to the console.
    public static void main(String[] args) {
        
        // No Overlapping Segments
        NoOverLapSegments noOverlapping = new NoOverLapSegments();
        int[] A = {1, 3, 7, 9, 9};
        int[] B = {5, 6, 8, 9, 10};
        int result = noOverlapping.solution(A, B);
        System.out.println("Number of non-overlapping segments: " + result);

    }
    
}
