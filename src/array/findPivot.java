package array;

public class findPivot {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum = totalSum + nums[i];
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                leftSum = leftSum + nums[i - 1];
            }
            if (totalSum - leftSum - nums[i] == leftSum) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));

    }
}
