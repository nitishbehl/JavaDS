package array;

public class maxConsecutive {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, maxCountTillNow = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ++maxCount;
            } else {
                maxCountTillNow = Math.max(maxCount, maxCountTillNow);
                maxCount = 0;
            }
        }

        return Math.max(maxCount, maxCountTillNow);
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
