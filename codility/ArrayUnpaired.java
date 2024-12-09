public class ArrayUnpaired {
    public int solution(int[] A) {
        int unpaired = 0;
        for (int number : A) {
            unpaired ^= number; // XOR operation to find unpaired element
        }
        return unpaired;
    }
}
