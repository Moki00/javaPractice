public class frogRiver {
    // This is a simple Java program that finds the earliest time when a frog can cross a river.
    // The frog can jump to any position from 1 to 'last' and it needs to cover all positions.
    public int solution(int last, int[] Arr) {
        // Create a boolean array to mark positions that have been covered.
        // The size should be (last + 1) because positions are from 1 to 'last'.
        // Index 0 can be ignored or used if positions start from 0.
        boolean[] coveredPositions = new boolean[last + 1];

        // Keep track of how many unique positions from 1 to 'last' we've seen.
        int uniqueCoveredCount = 0;

        // Iterate through the array (representing time in seconds/minutes)
        for (int i = 0; i < Arr.length; i++) {
            int currentLeafPosition = Arr[i];

            // Only consider leaf positions that are relevant (between 1 and 'last')
            if (currentLeafPosition >= 1 && currentLeafPosition <= last) {
                // If this position hasn't been covered yet
                if (!coveredPositions[currentLeafPosition]) {
                    coveredPositions[currentLeafPosition] = true; // Mark it as covered
                    uniqueCoveredCount++; // Increment the count of unique covered positions
                }
            }

            // Check if all positions from 1 to 'last' have been covered
            if (uniqueCoveredCount == last) {
                // If so, this is the earliest time (current index 'i')
                return i;
            }
        }

        // If the loop finishes and not all positions are covered, the frog can't cross
        return -1; // Or whatever value indicates it's impossible
    }
}