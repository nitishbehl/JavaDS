package array;

public class distanceBwStops {
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int startCopy = start;
        int clockWiseSum = 0;
        int antiClockWiseSum = 0;
        if (destination < start) {
            while (startCopy < distance.length - 1) {
                clockWiseSum += distance[startCopy];
                startCopy++;
            }
            startCopy = 0;
        }
        while (startCopy < destination) {
            clockWiseSum += distance[startCopy];
            startCopy++;
        }
        startCopy = start;

        while (startCopy >= destination) {
            antiClockWiseSum += distance[destination];
            destination--;
        }
        return Math.min(clockWiseSum, antiClockWiseSum);
    }

    public static void main(String[] args) {
        //       int[] distance = {7, 10, 1, 12, 11, 14, 5, 0};
        //       int[] distance = {1, 2, 3, 4};
        int[] distance = {3, 6, 7, 2, 9, 10, 7, 16, 11};
        System.out.println(distanceBetweenBusStops(distance, 6, 2));
    }
}
