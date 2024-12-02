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

        Nested nested = new Nested();
        String S = "{[()]}";
        if(nested.nested(S) == 1) {
            System.out.println(S + " is properly nested");
        } else {
            System.out.println(S + " is not nested");
        }

        Dominator dom = new Dominator();
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        int result = dom.dominator(A);
        if(result != -1) {
            System.out.println("Dominator is: " + A[result] + " at index: " + result);
        } else {
            System.out.println("No dominator found");
        }

        MaxProfit maxProfit = new MaxProfit();
        int[] dailyPrices = {23199, 21010, 21123, 21366, 21013, 21367};
        int profit = maxProfit.solution(dailyPrices);
        System.out.println("Maximum profit: $" + profit);

        Euclidean euclidean = new Euclidean();
        int numOfChoco = 10;
        int skip = 4;
        int uniqueChocos = euclidean.circleOfChoco(numOfChoco, skip);
        System.out.println("Unique chocos eaten: " + uniqueChocos);

        CountFactors countFactors = new CountFactors();
        int N = 24;
        int factorsCount = countFactors.solution(N);
        System.out.println("Number of factors of " + N + ": " + factorsCount);
    }
    
}
