package array;

public class partitionArray {
    public static boolean canThreePartsEqualSum(int[] A) {
        int sum = 0, result = 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i];  //9
        }

        result = sum / 3;  //3
        int runningSum = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            runningSum += A[i];
            if (runningSum == result) {
                runningSum = 0;
                count++;
            }
        }
        if (count >= 3) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = {-1, 1, -1, 1};
        System.out.println(canThreePartsEqualSum(A));

    }
}

