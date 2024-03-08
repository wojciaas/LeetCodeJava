package RemoveElement;

import static java.util.Arrays.sort;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2}; // Input array
        int val = 2; // Value to remove
        int[] expectedNums = {0,0,1,3,4}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < expectedNums.length; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length - k; i++) {
            if (nums[i] == val) {
                k++;
                while (nums[nums.length - k] == val) k++;
                if ()
            }
        }
        return k;
    }

    private static void swap(int[] arr, int src, int dst) {
        int tmp = arr[src];
        arr[src] = arr[dst];
        arr[dst] = tmp;
    }
}
