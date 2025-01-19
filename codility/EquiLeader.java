public class EquiLeader {

    /**
     * This equiFind method finds the number of equi leaders in the given array.
     * An equi leader is defined as a position P such that the leader of the
     * left part (A[0] to A[P]) and the leader of the right part (A[P+1] to A[N-1])
     * are the same.
     *
     * @param A an array of integers
     * @return the number of equi leaders
     */
    public int equiFind(int[] A) {
        int n = A.length;
        if (n == 0) return 0;

        // Step 1: Find the leader of the array
        int candidate = A[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (A[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = A[i];
                    count = 1;
                }
            }
        }

        // Step 2: Verify if the candidate is indeed a leader
        count = 0;
        for (int value : A) {
            if (value == candidate) {
                count++;
            }
        }

        if (count <= n / 2) return 0; // No leader found

        // Step 3: Count equi leaders
        int equiLeaderCount = 0;
        int leftCount = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] == candidate) {
                leftCount++;
            }
            int rightCount = count - leftCount;
            if (leftCount > (i + 1) / 2 && rightCount > (n - i - 1) / 2) {
                equiLeaderCount++;
            }
        }

        return equiLeaderCount;
    }
}
