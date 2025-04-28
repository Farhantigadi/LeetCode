package BinarySearch;
import java.util.Arrays;

// Medium - 34. Find First and Last Position of Element in Sorted Array
public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7, 7, 7, 8, 8};
        System.out.println(Arrays.toString(searchRange(arr, 8)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);  // First occurrence
        ans[1] = search(nums, target, false); // Last occurrence

        return ans;
    }

    static int search(int[] nums, int target, boolean leftSide) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (leftSide) {
                    end = mid - 1; // Move left to find first occurrence
                } else {
                    start = mid + 1; // Move right to find last occurrence
                }
            }
        }

        return ans;
    }
}
