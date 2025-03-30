public class GreedyAdd {

    /**
     * This method counts how many times we can add elements from the ropes array
     * such that their sum is at least threshold. After each addition, the sum is reset.
     *
     * @param threshold sum must be greater than or equal to this.
     * @param ropes The array of integers.
     * @return The number of times we can achieve a sum of at least "threshold".
     */
    public int solution(int threshold, int[] ropes) {
        int n = ropes.length;
        if (n == 0) return 0;

        int count = 0; // how many
        int sum = 0; // sum of elements

        for (int i = 0; i < n; i++) {
            sum += ropes[i];
            if (sum >= threshold) {
                count++;
                sum = 0; // Reset sum after reaching threshold
            }
        }

        return count;
    }
}
