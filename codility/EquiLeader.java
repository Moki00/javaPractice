public class EquiLeader {

    /**
     * This equiFind method finds the number of equi leaders in the given array.
     * An equi leader is defined at position "i" such that the leader of the
     * left part (A[0] to A[i]) and the leader of the right part (A[i+1] to A[n-1])
     * are more than half both sequences.
     *
     * @param A an array of integers
     * @return the number of equi leaders
     */
    public int equiFind(int[] A) {
        int n = A.length;
        if (n == 0) return 0;

        // Step 1: Find the leader of the array
        int leader = A[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (A[i] == leader) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    leader = A[i];
                    count = 1;
                }
            }
        }

        // Step 2: Verify if the candidate is indeed a leader
        count = 0;
        for (int value : A) {
            if (value == leader) {
                count++;
            }
        }

        if (count <= n / 2) return 0; // No leader

        // Step 3: Count equi leaders
        int equiLeaderCount = 0;
        int leftCount = 0; // always add up

        for (int i = 0; i < n; i++) {
            if (A[i] == leader) {
                leftCount++;
            }
            int rightCount = count - leftCount;
            if (leftCount > (i + 1) / 2 && rightCount > (n - i - 1) / 2) { // more than half
                equiLeaderCount++;
            }
        }

        return equiLeaderCount;
    }
}
