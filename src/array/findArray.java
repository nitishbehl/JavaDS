package array;

public class findArray {
    public static int findDisappearedNumbers(int[] nums) {
        int sum = 0, n = nums.length, total = 0, result = 0;
        for (int i = 0; i < n - 1; i++) {
            sum = n * (n + 1) / 2;
            total = total + nums[i];
            result = sum - total;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9};
        System.out.println(findDisappearedNumbers(arr));
    }
}



