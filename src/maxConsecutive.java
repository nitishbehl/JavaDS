public class maxConsecutive {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, set = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[i] != 0) {
                count++;
            }
        }
        for (int j = nums.length - 3; j < nums.length; j++) {
            if (nums[j] != 0) {
                set++;
            }
        }
        return Math.max(count, set);
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
