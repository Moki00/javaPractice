import java.util.*;

public class Main {
    // This is a simple Java program that prints "Hello world!" to the console.
    public static void main(String[] args) {
        
        // Max Slice Sum
        MaxSliceSum maxSliceSum = new MaxSliceSum();
        int[] sliceArray = {-3, -2, -6, -4, -90};
        int maxSum = maxSliceSum.solution(sliceArray);
        System.out.println("Maximum slice sum: " + maxSum);

    }
    
}
