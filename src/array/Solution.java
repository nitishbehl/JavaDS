package array;//Input: nums = [1,2,3,4]
//        Output: [1,3,6,10]
//        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].


import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
            System.out.println(Arrays.toString(nums));
        }
    }
}
