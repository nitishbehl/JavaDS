
package array;

//https://leetcode.com/problems/add-to-array-form-of-integer/
public class addArray {
    public static int addToArrayForm(int[] A, int K) {
        int result[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = A[i] % 10;


        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 0, 0};
        System.out.println(addToArrayForm(A, 34));
    }
}
