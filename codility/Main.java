public class Main {
    // This is a simple Java program that prints "Hello world!" to the console.
    public static void main(String[] args) {

        frogJump frogJump = new frogJump();
        int X = 10;
        int Y = 85;
        int D = 30;
        System.out.println("Number of jumps: " + frogJump.solution(X, Y, D));

        Distinct distinct = new Distinct();
        int[] Arr = {2, 1, 1, 2, 3, 1};
        System.out.println("Number of distinct elements: " + distinct.solution(Arr));
        
    }
    
}
