package array;

public class greatestElementOnRightSide {
    public static int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(temp, max);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {17, 18, 5, 4, 6, 1};
        int[] arr = replaceElements(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
