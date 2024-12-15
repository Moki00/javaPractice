public class Main {
    // This is a simple Java program that prints "Hello world!" to the console.
    public static void main(String[] args) {
        
        TapeEqual tapeEqual = new TapeEqual();
        int[] Arr = {3, 1, -2, 1, 1, -3};
        System.out.println("minimal difference is: " + tapeEqual.minimalDifference(Arr));

        Permutation permutation = new Permutation();
        int[] A = {4, 1, 3, 2};
        int result = permutation.isPermutation(A);
        if (result == 1) {
            System.out.println("The array is a permutation.");
        } else {
            System.out.println("The array is not a permutation.");
        }

    }
    
}
