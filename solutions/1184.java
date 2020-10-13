class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int dist1 = 0, dist2 = 0, n = distance.length;
        
        int idx = start;
        while (idx != destination) {
            dist1 += distance[idx];
            idx = (idx + 1) % n;
        }

        idx = destination;
        while (idx != start) {
            dist2 += distance[idx];
            idx = (idx + 1) % n;
        }

        return Integer.min(dist1, dist2);
    }
}