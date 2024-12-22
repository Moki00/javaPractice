public class Main {
    // This is a simple Java program that prints "Hello world!" to the console.
    public static void main(String[] args) {
        
        Nesting nesting = new Nesting();
        String input = "(()(())())";
        int result = nesting.solution(input);
        System.out.println("Nesting result for input '" + input + "': " + result);

    }
    
}
