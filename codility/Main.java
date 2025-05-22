public class Main {
    // This is a simple Java program that prints "Hello world!" to the console.
    public static void main(String[] args) {

        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        int[] result = cyclicRotation.solution(A, K);

        System.out.print("Rotated array: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
    
}
