import java.util.Stack;

public class Main {
    // This is a simple Java program that prints "Hello world!" to the console.
    public static void main(String[] args) {
        
        EquiLeader equiLeader = new EquiLeader();
        int[] A = {4, 3, 4, 4, 4, 2};
        int equiLeaders = equiLeader.equiFind(A);
        System.out.println("Number of equi leaders in array " + java.util.Arrays.toString(A) + ": " + equiLeaders);

    }
    
}
