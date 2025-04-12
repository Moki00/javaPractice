public class MinPerimeterRectangle {

    public int solution(int N) {
        // Initialize the minimum perimeter to a large value
        int minPerimeter = Integer.MAX_VALUE;
        // Iterate through all possible factors of N
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                // i is a factor, so N / i is the corresponding factor
                int width = i;
                int height = N / i;
                // Calculate the perimeter of the rectangle
                int perimeter = 2 * (width + height);
                // Update the minimum perimeter if the current one is smaller
                if (perimeter < minPerimeter) {
                    minPerimeter = perimeter;
                }
            }
        }


        return minPerimeter;
    }
    
}
