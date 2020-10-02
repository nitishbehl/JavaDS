public class SmallerNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i] && j != i) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

//    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] result = new int[nums.length];
//
//        int[] numsCopy = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            numsCopy[i] = nums[i];
//        }
//
//        Arrays.sort(numsCopy);
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int index = 0; index < numsCopy.length; index++) {
//            if (!map.containsKey(numsCopy[index])) {
//                map.put(numsCopy[index], index);
//            }
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            result[i] = map.get(nums[i]);
//        }
//        return result;
//    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] ints = smallerNumbersThanCurrent(nums);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
//        System.out.println(ints);
    }
}
