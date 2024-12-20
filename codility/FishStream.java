public class FishStream {
    public int solution(int[] A, int[] B) {
        int n = A.length;
        int[] stack = new int[n];
        int aliveFish = 0;

        for (int i = 0; i < n; i++) {
            if (B[i] == 1) { // Downstream fish
                stack[++top] = A[i];
            } else { // Upstream fish
                while (top >= 0 && stack[top] < A[i]) {
                    top--; // Upstream fish eats downstream fish
                }
                if (top == -1 || stack[top] > A[i]) {
                    stack[++top] = A[i]; // Upstream fish survives
                }
            }
        }

        return aliveFish + 1; // Number of surviving fish
    }
}
