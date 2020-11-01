package array;

public class meanArray {
    public static double trimMean(int[] arr) {
        double minNumber = Integer.MAX_VALUE;
        double maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            } else if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }
        double sum = 0.0000;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double mean = (sum - maxNumber - minNumber) / (arr.length - 2);
        return mean;
    }

    public static void main(String[] args) {
        int[] arr = {9, 7, 8, 7, 7, 8, 4, 4, 6, 8, 8, 7, 6, 8, 8, 9, 2, 6, 0, 0, 1, 10, 8, 6, 3, 3, 5, 1, 10, 9, 0, 7, 10, 0, 10, 4, 1, 10, 6, 9, 3, 6, 0, 0, 2, 7, 0, 6, 7, 2, 9, 7, 7, 3, 0, 1, 6, 1, 10, 3};
        System.out.println(trimMean(arr));

    }
}
