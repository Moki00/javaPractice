public class NoOverLapSegments {
    public int solution(int[] A, int[] B) {
        if (A.length == 0 || B.length == 0) {
            return 0;
        }

        int nonOverlapCount = 0;
        int lastEnd = -1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > lastEnd) {
                nonOverlapCount++;
                lastEnd = B[i];
            } else if (B[i] > lastEnd) {
                lastEnd = B[i];
            }
        }

        return nonOverlapCount;
    }
}
