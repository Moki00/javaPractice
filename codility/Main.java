import java.util.*;

public class Main {
    // This is a simple Java program that prints "Hello world!" to the console.
    public static void main(String[] args) {
        
        // Min Perimeter Rectangle
        MinPerimeterRectangle minPerimeterRectangle = new MinPerimeterRectangle();
        int N = 30;
        int minPerimeter = minPerimeterRectangle.solution(N);
        System.out.println("Minimum perimeter of rectangle with area " + N + ": " + minPerimeter);



    }
    
}
