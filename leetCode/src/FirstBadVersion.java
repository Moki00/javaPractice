public class FirstBadVersion {
    public static void main(String[] args) {
        firstBadVersion(2126753390);

    }

    private static int firstBadVersion(int n) {
        /*
         * n is number of versions ggbbbbb= 7 versions, first 2 = good, then 3+ = bad bb
         * = both bad
         */
        int max = n;
        int min = 1;
        // loop until good and bad are next to each other
        while (max > min + 1) {
            // avoid overflow
            int mid = min + (max - min) / 2;
            System.out.println(max);
            if (isBadVersion(mid)) {
                max = mid;
                System.out.println("is bad: " + max);
            } else {
                min = mid;
                System.out.println("is good: " + min);
            }

        }

        if (isBadVersion(min)) {
            System.out.println("min was bad: " + min);
            return min;
        } else {
            System.out.println("returning: " + max);
            return max;
        }

    }

    private static boolean isBadVersion(int i) {

        // pretend 170276 or greater are all bad

        return i >= 170276;
    }

}
