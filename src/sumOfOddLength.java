import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//public class sumOfOddLength {
class sumOddLength {

    public static int sumOddLengthSubarrays(int[] arr) {
        List<List<Integer>> arrayList = new ArrayList<>();
        int total = 0;
        int length = arr.length;
        int count = 1;
        while (count <= length) {
            for (int i = 0; i < length; i++) {
                List<Integer> subList = new ArrayList();
                int j = i;
                while (j < count + i) {
                    total += arr[j];
                    subList.add(arr[j]);
                    j++;
                }
                Collections.addAll(arrayList, subList);
                if (count + i == length) {
                    break;
                }
            }
            count = count + 2;
        }

        return total;
    }


    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
}
