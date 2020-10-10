public class sumToZero {
    public static int[] sumZero(int n) {
        int remainder = n % 2;
        int possitive = n / 2;
        int a[] = new int[n];
        if (remainder == 0) {
            for (int i = 0; i < n; i++) {
                a[i] = possitive--;
                if (a[i] == 0) {
                    a[i] = possitive--;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                a[i] = possitive--;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int num = 5;
        int[] arr = sumZero(num);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
