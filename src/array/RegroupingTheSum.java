package array;

public class RegroupingTheSum {
    public static int subarraySum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] * (i + 1) * (arr.length - i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(subarraySum(arr));
    }


}
