public class CountFactors {

    // How many factors does a number N have?
    public static int solution(int num) {

        if (num == 1) {
            return 1;
        }
        if (num == 2 || num == 3) {
            return 2;
        }

        int count = 1;
        int exponent = 0;
        int temp = num;
        for (int i=2; i<=temp/i; i++){
            // 2= first prime number, loop through all numbers from 2 to the square root of num
            // We only need to check up to the square root of num, since factors come in pairs
            // If i is a factor of temp, we will count how many times it divides temp
            // and multiply the count by (exponent + 1) to account for all factors
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
            // If temp is still greater than 1, it means it is a prime factor itself
            count *= 2;
        }

        return count;
    }
}
