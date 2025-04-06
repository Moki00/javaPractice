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

        // Greedy Add
        GreedyAdd greedyAdd = new GreedyAdd();
        int[] ropes = {1, 2, 3, 4, 5}; // Example ropes array
        int threshold = 5;
        int count = greedyAdd.solution(threshold, ropes);
        System.out.println("Number of times we can achieve threshold: " + count);

        // Max Slice Sum
        MaxSliceSum maxSliceSum = new MaxSliceSum();
        int[] sliceArray = {3, 2, -6, 4, 0};
        int maxSum = maxSliceSum.solution(sliceArray);
        System.out.println("Maximum slice sum: " + maxSum);



    }


    
}
