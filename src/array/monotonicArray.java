package array;

public class monotonicArray {
    public static boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1])
                increasing = false;
            if (A[i] > A[i + 1])
                decreasing = false;
        }
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2};
        System.out.println(isMonotonic(arr));
    }
}
