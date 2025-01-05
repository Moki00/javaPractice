import java.util.Stack;

public class Main {
    // This is a simple Java program that prints "Hello world!" to the console.
    public static void main(String[] args) {
        
        StackBlocks stackBlocks = new StackBlocks();
        int[] heights = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        int blocksNeeded = stackBlocks.solution(heights);
        System.out.println("Number of blocks needed for heights " + java.util.Arrays.toString(heights) + ": " + blocksNeeded);


    }
    
}
