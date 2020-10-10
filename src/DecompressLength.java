import java.util.ArrayList;
import java.util.List;

public class DecompressLength {
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            while (freq != 0) {
                list.add(val);
                freq--;
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] input = {2, 2, 3, 4};
        int[] arr = decompressRLElist(input);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
