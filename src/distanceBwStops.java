public class distanceBwStops {
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockwise = 0, smallerDistance = 0;
        for (int i = 0; i < distance.length; i++) {
            if (i >= start && i < destination) {
                clockwise = clockwise + distance[i];
            } else {
                smallerDistance = smallerDistance + distance[i];
            }
        }
        return Math.min(clockwise, smallerDistance);
    }

    public static void main(String[] args) {
        int[] distance = {1, 2, 3, 4};
        System.out.println(distanceBetweenBusStops(distance, 0, 3));
    }
}
