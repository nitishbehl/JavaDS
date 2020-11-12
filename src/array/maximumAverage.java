package array;

//https://leetcode.com/problems/maximum-average-subarray-i/
public class maximumAverage {
    public static double findMaxAverage(int[] nums, int k) {
        double average = 0.00, sum = 0.00;
        for (int i = 1; i < nums.length - 1; i++) {
            sum = sum + nums[i];
            average = sum / k;
        }
        return average;

    }

    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(arr, 4));
    }
}
