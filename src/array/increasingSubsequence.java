package array;

public class increasingSubsequence {
    public static int findLengthOfLCIS(int[] nums) {
        int current = 1;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                current = current + 1;
            } else if (nums[i] == nums[i + 1]) {
                return 1;
            }
        }
        return current;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(findLengthOfLCIS(nums));
    }
}
