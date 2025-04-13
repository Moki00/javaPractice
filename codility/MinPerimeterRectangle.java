public class MinPerimeterRectangle {

    public int solution(int N) {

        int perimeter = Integer.MAX_VALUE;

        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                // i is a factor, so N / i is the corresponding factor
                int width = i;
                int height = N / i;
                perimeter = Math.min(perimeter, 2 * (width + height));
            }
        }


        return perimeter;
    }
    
}
