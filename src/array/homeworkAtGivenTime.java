package array;

public class homeworkAtGivenTime {
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int[] startTime = {1, 2, 3};
        int[] endTime = {3, 2, 7};
        int queryTime = 4;
//        int[] arr = busyStudent(startTime,endTime,queryTime);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//            System.out.print(" ");
//        }


    }
}
