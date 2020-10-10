public class EvenNumberOfDigit {
    public static int findNumbers(int[] nums) {
        int count = 0, digit = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != 0) {
                nums[i] = nums[i] / 10;
                digit++;
            }
            if (digit % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] input = {437, 315, 322, 431, 686, 264, 442};
        System.out.println(findNumbers(input));
    }
}
