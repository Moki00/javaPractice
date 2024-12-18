public class Main {
    // This is a simple Java program that prints "Hello world!" to the console.
    public static void main(String[] args) {
        
        Triangle triangle = new Triangle();
        int[] C = {10, 2, 5, 1, 8, 20};
        int triangleResult = triangle.solution(C);
        if (triangleResult == 1) {
            System.out.println("The array can form a triangle.");
        } else {
            System.out.println("The array cannot form a triangle.");
        }


    }
    
}
