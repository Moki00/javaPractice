public class CountFactors {

    // How many factors does a number N have?
    public static int solution(int num) {

        if (num == 1) {
            return 1; // 1 has exactly one factor: itself
        }
        if (num == 2 || num == 3) {
            return 2; // 2 has two factors: 1 and 2
        }

        int count = 1; // Start with 1 for the number itself
        int exponent = 0;
        int temp = num;
        for (int i=2; i*i<=temp; i++){// 2= first prime number
            // check up to the square root of num, since factors come in pairs
            if (temp % i == 0) {
                exponent = 0;
                while (temp % i == 0) {
                    temp /= i; // Divide out the factor
                    exponent++; // Count the exponent of the prime factor
                }
                count *= (exponent + 1); // For each prime factor, add 1 to the exponent and multiply
                // to the count of factors

            }
        }
        if (temp > 1) {
            // If temp is still greater than 1, it means it's a prime factor itself
            count *= 2; // It contributes two factors: 1 and itself
            
        }

        return count;
    }
}
