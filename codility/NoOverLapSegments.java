public class NoOverLapSegments {
    public int solution(int[] A, int[] B) {
        if (A.length == 0) {
            return 0;
        }

        int nonOverlapCount = 0;
        int lastEnd = -1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > lastEnd) { // If the start of the current segment is greater than the end of the last non-overlapping segment
                nonOverlapCount++;
                lastEnd = B[i]; // Update the end of the last non-overlapping segment
            } else if (B[i] > lastEnd) { 
                lastEnd = B[i];
            }
        }

        return nonOverlapCount;
    }
}
