
public class LogN_Methods {
	public boolean binarySearch(int[] nums, int target) {

		int left = 0;
		int right = nums.length - 1;
		int count = 0;

		while (left <= right) {
			int middle = left + ((right - left) / 2);
			if (target < nums[middle]) {
				right = middle - 1;

			} else if (nums[middle] < target) {
				left = middle + 1;

			} else if (nums[middle] == target) {
				System.out.println(target + " exists");
				return true;
			}

		}
		return false;
	}

	public static int binarySearchRecursion(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x)
				return binarySearchRecursion(arr, l, mid - 1, x);
			return binarySearchRecursion(arr, mid + 1, r, x);
		}
		return -1;
	}

	public static int findFirstOccurrence(int[] nums, int target) {
		// search space is nums[left…right]
		int left = 0;
		int right = nums.length - 1;

		// initialize the result by -1
		int result = -1;

		// loop till the search space is exhausted
		while (left <= right) {
			// find the mid-value in the search space and compares it with the target
			int mid = (left + right) / 2;

			// if the target is located, update the result and
			// search towards the left (lower indices)
			if (target == nums[mid]) {
				result = mid;
				right = mid - 1;
			}

			// if the target is less than the middle element, discard the right half
			else if (target < nums[mid]) {
				right = mid - 1;
			}

			// if the target is more than the middle element, discard the left half
			else {
				left = mid + 1;
			}
		}

		// return the leftmost index, or -1 if the element is not found
		return result;
	}

}
