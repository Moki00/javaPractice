public class CountFactors {

    // How many factors does a number N have?
    public static int solution(int num) {

        if (num == 1) {
            return 1; // 1 has exactly one factor: itself
        }
        if (num == 2 || num == 3) {
            return 2; // 2 has two factors: 1 and 2
        }

        int count = 0;
        int i=1; // first prime number
        // Check for factors starting from 2 up to the square root of num
        while (i < Math.sqrt(num) + 1) {
            // We can check up to the square root of num, since factors come in pairs
            // For example, if num = 24, factors are (1, 24), (2, 12), (3, 8), (4, 6)
            if (num % i == 0) {
                count += (i * i == num) ? 1 : 2; // Count both divisors if they are different
            }
            i++;
        }

        return count;
    }
}
