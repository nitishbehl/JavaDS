package array;//https://leetcode.com/problems/move-zeroes/

public class moveZeroes {
    public static int[] moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] != 0) {
                    nums[j] = nums[i];
                    j++;
                }
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(moveZeroes(nums));


    }
}
