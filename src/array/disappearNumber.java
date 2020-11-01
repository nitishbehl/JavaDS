package array;

public class disappearNumber {
    public static long findDisappearedNumbers(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + i;
            if (sum != i + 1) {

            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6};
        System.out.println(findDisappearedNumbers(nums));
    }

}
