import java.util.Stack;

public class StackBlocks {
    public int solution(int[] H){

        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int height : H) {
            // If the stack is empty or the current height is greater than the top of the stack
            if (stack.isEmpty() || height > stack.peek()) {
                stack.push(height); // Push the new height onto the stack
                count++; // Increment the count of blocks
            } else if (height < stack.peek()) {
                // If the current height is less than the top of the stack, pop until we find a height less than or equal to the current height
                while (!stack.isEmpty() && stack.peek() > height) {
                    stack.pop();
                }
                // If we popped all elements, we need to add a new block
                if (stack.isEmpty() || stack.peek() < height) {
                    stack.push(height);
                    count++;
                }
            }
        }

        return count; // Return the total number of blocks needed
    }
}
