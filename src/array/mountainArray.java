package array;

public class mountainArray {
    public static boolean validMountainArray(int[] A) {
        if (A.length < 3 || A[0] > A[1]) {
            return false;
        }
        int left = 0, right = A.length - 1;
        while (left < right) {
            if (A[left + 1] > A[left]) {
                left++;
            } else if (A[right - 1] > A[right]) {
                right--;
            } else {
                break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 5};
        System.out.println(validMountainArray(arr));
    }
}
