package array;

public class thirdMax {
    public static int thirdMax(int[] nums) {
        int max = nums[0], secondMax = nums[1], thirdMax = nums[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = nums[i];
            } else if (nums[i] > secondMax && nums[i] < max) {
                thirdMax = secondMax;
                secondMax = max;
            } else if (nums[i] > thirdMax && nums[i] < secondMax) {
                thirdMax = max;
            }

        }
        return thirdMax;

    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        System.out.println(thirdMax(nums));
    }
}
