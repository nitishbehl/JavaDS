
//https:leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
public class maxProduct {
    public static int maxProduct(int[] nums) {
        int i = 0, j = 1, max = 0;
        for (i = 0; i < nums.length - 1; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if ((nums[i] - 1) * (nums[j] - 1) > max) {
                    max = ((nums[i] - 1) * (nums[j] - 1));
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
        System.out.println(maxProduct(nums));
    }
}
