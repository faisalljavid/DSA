package BSQuestions;
import java.util.Arrays;

// Find the First and Last occurrence of a given number
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLast {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 8, 8, 10};
        int target = 3;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        // check for first occurrence if target first
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;

        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if(findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

