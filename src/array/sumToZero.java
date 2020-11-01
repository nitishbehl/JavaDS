package array;

public class sumToZero {
    public static int[] sumZero(int n) {
        int remainder = n % 2;
        int possitive = n / 2;
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = possitive--;
            if (remainder == 0) {
                if (arr[i] == 0) {
                    arr[i] = possitive--;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int num = 6;
        int[] arr = sumZero(num);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
