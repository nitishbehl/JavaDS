package array;

//kedans algorithm
public class maxSubArray {
    public static int maxSubArray(int[] nums) {
        int maximumEndHere = 0, maximumSoFar = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maximumEndHere = maximumEndHere + nums[i];
            if (maximumEndHere < nums[i]) {
                maximumEndHere = nums[i];
            }
            if (maximumSoFar < maximumEndHere) {
                maximumSoFar = maximumEndHere;
            }
        }
        return maximumSoFar;

    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));

    }
}
