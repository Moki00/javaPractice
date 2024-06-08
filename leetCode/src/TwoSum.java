import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums1 = new int[]{5, 1, 2, 3, 4, 5};
        int[] product = twoSum(nums1, 9);

        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i]);
        }

    }

    /**
     * this finds the location of two numbers in a list that sum up to the target
     *
     * @param nums
     * @param target
     * @return a list
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[]{numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }

        throw new IllegalArgumentException();
    }

}
