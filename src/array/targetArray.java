package array;

//https:leetcode.com/problems/create-target-array-in-the-given-order/submissions/
public class targetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (index[i] < i) {
                for (int j = i; j > index[i]; j--) {
                    target[j] = target[j - 1];
                }
            }
            target[index[i]] = nums[i];
        }
        return target;
    }

    public static void main(String[] args) {
        int[] input = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] target = createTargetArray(input, index);
        for (int i = 0; i < target.length; i++) {
            System.out.print(target[i]);
            System.out.print(" ");
        }
    }
}
