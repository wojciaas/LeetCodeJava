package TwoSum;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] arr = twoSum(new int[]{1, 2, 4, 9}, 11);
        Arrays.stream(arr).forEach(System.out::println);
    }
    public static int[] twoSum(int[] nums, int target) {
        int i = 0, j = i + 1;
        while (i < nums.length && nums[i] + nums[j] != target) {
            j++;
            if(j == nums.length) {
                i++;
                j = i + 1;
            }
        }
        return new int[]{i, j};
    }
}

//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        for(int i=1;i<nums.length;i++)
//        {
//            for(int j=i;j<nums.length;j++)
//            {
//                if(nums[j-i]+nums[j]==target)
//                {
//                    return new int[]{j-i,j};
//                }
//            }
//        }
//        return new int[]{};
//    }
//}
