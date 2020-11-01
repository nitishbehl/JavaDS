//https://leetcode.com/problems/maximum-product-of-three-numbers/solution/
package array;

public class maximumPRODUCT {
    public static int maximumProduct(int[] nums) {
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product = product * nums[i];
        }
        return product;

    }

    public static void main(String[] args) {
        int[] nums = {-1, -2, -3};
        System.out.println(maximumProduct(nums));

    }
}
