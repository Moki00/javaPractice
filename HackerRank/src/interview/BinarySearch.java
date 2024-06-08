package interview;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr= {13, 22,34,46,57,64,79};
		
		int target = 34;

		System.out.print("Target number ("+target+") is located at: ");
		System.out.println(search(arr, target));
	}

	private static int search(int[] nums, int target) {

		// location in nums array
		int max = nums.length-1;
		int min = 0;
		
		while(max>=min) {
			int mid = (max+min)/2;
			if(nums[mid]==target) {
				return mid;
			} else if(nums[mid]>target) {
				max=mid-1;
			} else {
				min=mid+1;
			}
		}
		return -1;
	}

}
